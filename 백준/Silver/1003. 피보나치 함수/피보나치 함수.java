import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    static int[][] memory;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        memory = new int[41][2];

        memory[0][0] = 1;
        memory[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            memory[i][0] = memory[i - 1][0] + memory[i - 2][0];
            memory[i][1] = memory[i - 1][1] + memory[i - 2][1];
        }

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(memory[n][0]).append(" ").append(memory[n][1]).append("\n");
        }
        System.out.println(sb);

    }
}