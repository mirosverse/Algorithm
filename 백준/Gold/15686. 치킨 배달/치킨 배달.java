import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, answer;
    static int[][] map;
    static boolean[] isVisited;

    static List<int[]> chicken, house, selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        chicken = new ArrayList<>();
        house = new ArrayList<>();
        selected = new LinkedList<>();


        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) house.add(new int[]{i, j});
                else if (map[i][j] == 2) chicken.add(new int[]{i, j});
            }
        }

        answer = Integer.MAX_VALUE;
        isVisited = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(answer);

    }


    public static void dfs(int depth, int idx) {
        if (depth == M) {
            answer = Math.min(answer, findChickenHouse(house, selected));
            return;
        }

        for (int i = idx; i < chicken.size(); i++) {
            if (isVisited[i]) continue;
            isVisited[i] = true;
            selected.add(new int[]{chicken.get(i)[0], chicken.get(i)[1]});
            dfs(depth + 1, i);
            selected.remove(selected.size() - 1);
            isVisited[i] = false;
        }
    }

    // selected 된 치킨집과 house의 최단거리 합을 반환한다.
    public static int findChickenHouse(List<int[]> house, List<int[]> selected) {
        int sum = 0;
        for (int[] home : house) {
            int minDistance = Integer.MAX_VALUE;
            for (int[] select : selected) {
                int distance = getDistance(home[0], home[1], select[0], select[1]);
                minDistance = Math.min(minDistance, distance);
            }
            sum += minDistance;
        }
        return sum;
    }

    public static int getDistance(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) + Math.abs(c2 - c1);
    }
}