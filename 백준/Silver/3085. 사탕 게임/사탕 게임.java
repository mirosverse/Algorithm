import java.io.*;
import java.util.*;

public class Main {
    static int max = 0, n;
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                swap(i, j);
            }
            if(max == n) break;
        }

        System.out.println(max);
    }

    static void swap(int x, int y) {

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (board[nx][ny] == board[x][y]) continue;

            char temp = board[x][y];
            board[x][y] = board[nx][ny];
            board[nx][ny] = temp;
            eat();
            temp = board[x][y];
            board[x][y] = board[nx][ny];
            board[nx][ny] = temp;

        }
    }

    static void eat() {
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            char cur = board[i][0];
            for (int j = 1; j < n; j++) {
                if (cur == board[i][j]) cnt++;
                else {
                    cur = board[i][j];
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            char cur = board[0][i];
            for (int j = 1; j < n; j++) {
                if (cur == board[j][i]) cnt++;
                else {
                    cur = board[j][i];
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }
    }
}