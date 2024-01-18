import java.io.*;
import java.util.*;

public class Main {
    static int[] dp = new int[1001];
    static boolean found;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i < 1001; i++) {
            dp[i] = i * (i + 1) / 2;
        }

        for (int test_case = 1; test_case <= T; test_case++) {
            int K = Integer.parseInt(br.readLine());
            found = false;
            solve(0, K);
            System.out.println(found ? 1 : 0);

        }

    }


    static void solve(int depth, int K) {
        if (found || depth == 3) {
            if (K == 0) found = true;
            return;
        }

        for (int i = 1; i < 1001; i++) {
            if (K - dp[i] < 0) break;
            solve(depth + 1, K - dp[i]);
        }
    }
}