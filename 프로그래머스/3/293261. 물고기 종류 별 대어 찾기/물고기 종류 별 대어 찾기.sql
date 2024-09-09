-- 코드를 작성해주세요
WITH FISH_RANKED AS (
    SELECT  f.ID, 
            f.FISH_TYPE,
            f.LENGTH,
            n.FISH_NAME,
            ROW_NUMBER() OVER (PARTITION BY f.FISH_TYPE ORDER BY f.LENGTH DESC) RN
    FROM FISH_INFO f
    JOIN FISH_NAME_INFO n
    ON f.FISH_TYPE = n.FISH_TYPE
)
select f.ID, f.FISH_NAME, f.LENGTH
from FISH_RANKED f 
WHERE RN = 1
ORDER BY f.ID;