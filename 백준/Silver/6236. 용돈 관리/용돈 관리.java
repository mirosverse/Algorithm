import java.io.*;
import java.util.*;

class Main {
    static int N, M;
    static int[] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cost = new int[N];
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solve());

    }

    static int solve() {
        int l = 0, r = N * 10000, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (find(m)) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    // K(money)원  인출
    static boolean find(int money) {
        int count = 0, wallet = 0;
        for (int i = 0; i < N; i++) {
            if (cost[i] > wallet) {
                wallet = money;
                count++;
            }
            wallet -= cost[i];
            if (wallet < 0) return false;
        }
        return count <= M;
    }


}

