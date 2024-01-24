import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') board[i][j] = 0;
                else board[i][j] = 1;
            }
        }

        int ans = 50 * 50;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                ans = Math.min(ans, solve(i, j));
            }
        }
        
        System.out.println(ans);

    }

    static int solve(int x, int y) {
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 0) cnt1++;
                    else cnt2++;
                } else {
                    if (board[i][j] != 1) cnt1++;
                    else cnt2++;
                }
            }
        }
        return Math.min(cnt1, cnt2);
    }
}
