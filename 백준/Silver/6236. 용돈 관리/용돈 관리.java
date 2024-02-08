import java.io.*;
import java.util.*;

class Main {
    static int[] bank;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        bank = new int[N];

        for (int i = 0; i < N; i++) {
            bank[i] = Integer.parseInt(br.readLine());
        }

        int l = 1, r = N * 100000, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (isPossible(m)) {
                ans = m;
                r = m - 1;
            } else l = m + 1;
        }

        System.out.println(ans);
    }

    static boolean isPossible(int money) {
        int cnt = 0, amount = 0;
        for (int budget : bank) {
            if (budget > money) return false;
            if (amount < budget) {
                cnt++;
                amount = money;
            }
            amount -= budget;
        }
        return cnt <= M;
    }
}