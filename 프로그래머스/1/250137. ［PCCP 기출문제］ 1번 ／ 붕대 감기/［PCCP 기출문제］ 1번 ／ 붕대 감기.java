class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int beforeAttackTime = attacks[0][0] - 1;

        for (int[] attack : attacks) {
            int time = attack[0] - beforeAttackTime - 1;
            health += time * bandage[1];
            health += time / bandage[0] * bandage[2];
            health = Math.min(health, maxHealth);
            health -= attack[1];
            beforeAttackTime = attack[0];

            if (health <= 0) {
                return -1;
            }
            System.out.println(health);
        }
        
        return health;
    }
}