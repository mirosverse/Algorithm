import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new Integer[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N - 1][i] = arr[N - 1][i];
        }

        System.out.println(solve(0, 0));

    }

    static int solve(int i, int j) {
        if (i == N - 1) {
            return dp[i][j];
        }

        if (dp[i][j] == null) {
            dp[i][j] = Math.max(solve(i + 1, j), solve(i + 1, j + 1)) + arr[i][j];
        }
        return dp[i][j];
    }
}