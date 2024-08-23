import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] answer;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        answer = new int[M + 1];
        sb = new StringBuilder();

        solve(1);
        System.out.println(sb.toString());
    }

    public static void solve(int depth) {
        if (depth > M) {
            print();
            return;
        }

        for (int i = answer[depth - 1]; i <= N; i++) {
            if (i <= 0) continue;
            answer[depth] = i;
            solve(depth + 1);
        }
    }

    public static void print() {
        for (int i = 1; i <= M; i++) {
            sb.append(answer[i]).append(" ");
        }
        sb.append("\n");
    }
}