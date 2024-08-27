import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(solve(N));
    }

    public static int solve(int n) {
        int count = 1;

        int cur = 1;
        while (true) {
            if(cur >= n) return count;
            cur += 6 * count;
            count++;
        }
    }


}