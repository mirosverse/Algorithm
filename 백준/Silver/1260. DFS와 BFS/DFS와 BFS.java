import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
- dfs
 1. 스택
 2. 재귀함수
- bfs
 1. 큐
 */
public class Main {
    public static int[][] array;
    public static int N, M, V;
    public static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] split = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        N = split[0];
        M = split[1];
        V = split[2];

        array = new int[N + 1][N + 1];
        while (M-- > 0) {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            array[temp[0]][temp[1]] = array[temp[1]][temp[0]] = 1;
        }

//        dfsByStack(1);
//        result.append("\n");
        dfsByRecursive(V, new boolean[N + 1]);
        result.append("\n");
        bfs(V);
        
        System.out.println(result);
    }


    public static void dfsByRecursive(int start, boolean[] visited) {
        visited[start] = true;
        result.append(start).append(" ");

        for (int i = 1; i < N + 1; i++) {
            if (array[start][i] == 1 && !visited[i]) {
                dfsByRecursive(i, visited);
            }
        }
    }

    public static void dfsByStack(int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[N + 1];
        stack.push(start);

        while (!stack.isEmpty()) {
            Integer current = stack.pop();

            if (!visited[current]) {
                result.append(current).append(" ");
                visited[current] = true;
            }

            for (int i = N; i > 0; i--) {
                if (array[current][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            start = queue.poll();
            for (int i = 1; i < N + 1; i++) {
                if (array[start][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
            result.append(start).append(" ");
        }
    }
}