import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] board;
    static boolean[][] visited;
    static List<int[]> cheese = new ArrayList<>();

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) cheese.add(new int[]{i, j});
            }
        }

        init(0,0);

        int time = 0;
        while (!cheese.isEmpty()) {
            time++;
            List<Integer> removeList = new ArrayList<>();
            for (int i = 0; i < cheese.size(); i++) {
                int count = 0;
                for (int j = 0; j < 4; j++) {
                    int nx = cheese.get(i)[0] + dx[j];
                    int ny = cheese.get(i)[1] + dy[j];
                    if (board[nx][ny] == 2) count++;
                }
                if (count >= 2) removeList.add(i);
            }
            remove(removeList);
        }

        System.out.println(time);


    }

    static void remove(List<Integer> removeList) {
        for (int i = 0; i < removeList.size(); i++) {
            int[] remove = cheese.remove(removeList.get(i) - i);
            checkOutside(remove[0], remove[1]);
        }
    }

    static void checkOutside(int x, int y) {
        board[x][y] = 2;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(board[nx][ny] == 0) checkOutside(nx, ny);
        }

    }

    // 외부 공기를 2로 초기화
    static void init(int x, int y) {
        board[x][y] = 2;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
            if (board[nx][ny] == 0) init(nx, ny);
        }
    }



}