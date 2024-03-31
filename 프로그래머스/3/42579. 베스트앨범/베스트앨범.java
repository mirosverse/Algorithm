import java.util.*;

class Solution {

    public static int[] solution(String[] genres, int[] plays) {
        List<Integer> songs = new LinkedList<>();
        Map<String, Integer> genreCount = new LinkedHashMap<>();
        Map<String, List<Integer>> genreID = new LinkedHashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genreCount.put(genres[i], genreCount.getOrDefault(genres[i], 0) + plays[i]);
            List<Integer> list = genreID.getOrDefault(genres[i], new ArrayList<>());
            list.add(i);
            genreID.put(genres[i], list);
        }


        for (List<Integer> ids : genreID.values()) {
            ids.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return plays[o2] - plays[o1];
                }
            });

            songs.add(ids.get(0));
            if (ids.size() >= 2) {
                songs.add(ids.get(1));
            }
        }

        songs.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (genres[o1].equals(genres[o2])) {
                    if (plays[o1] == plays[o2]) {
                        return o1 - o2;
                    }
                    return plays[o2] - plays[o1];
                }
                return genreCount.get(genres[o2]) - genreCount.get(genres[o1]);

            }
        });

        return songs.stream().mapToInt(i -> i).toArray();
    }
}


