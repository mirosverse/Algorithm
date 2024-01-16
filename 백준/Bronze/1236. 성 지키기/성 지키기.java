import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] castle = new String[N][M];
        int[] row = new int[N];
        int[] column = new int[M];

        for (int i = 0; i < N; i++) {
            castle[i] = br.readLine().split("");
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (castle[i][j].equals("X")) {
                    row[i]++;
                    column[j]++;
                }
            }
        }

        int r = 0, c = 0;
        for (int i = 0; i < N; i++) {
            if (row[i] == 0) r++;
        }
        for (int i = 0; i < M; i++) {
            if (column[i] == 0) c++;
        }
        System.out.println(Math.max(r, c));

    }
}






