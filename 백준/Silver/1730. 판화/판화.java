import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[] d = {'U', 'D', 'L', 'R'};
    static int x = 0, y = 0, n;
    static char[][] board;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        String comm = br.readLine();
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        for (int i = 0; i < comm.length(); i++) {
            for (int j = 0; j < d.length; j++) {
                if (comm.charAt(i) == d[j]) {
                    draw(j);
                    break;
                }
            }
        }

        bw.write(printResult());

        bw.flush();
        bw.close();
    }

     static String printResult() {
        StringBuilder str = new StringBuilder();
        for (char[] chars : board) {
            for (char c : chars) {
                str.append(c);
            }
            str.append("\n");
        }
        return str.toString();
    }

    static void draw(int com) {
        int nx = x + dx[com];
        int ny = y + dy[com];

        if (nx < 0 || nx >= n || ny < 0 || ny >= n) return;

        char temp;
        if (com < 2) temp = '|';
        else temp = '-';

        if (board[x][y] != '.' && temp != board[x][y]) board[x][y] = '+';
        else board[x][y] = temp;
        if (board[nx][ny] != '.' && temp != board[nx][ny]) board[nx][ny] = '+';
        else board[nx][ny] = temp;

        x = nx;
        y = ny;
    }

}