import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr, dp1, dp2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp1 = new int[N];
        dp2 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        init();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dp1[i] + dp2[i]);
        }
        System.out.println(answer + 1);
    }

    static void init() {
        for (int i = 0; i < N; i++) {
            LIS1(i);
            LIS2(N - i - 1);
        }
    }

    // 증가하는 구간
    static void LIS1(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[n]) {
                dp1[n] = Math.max(dp1[n], dp1[i] + 1);
            }
        }
    }

    // 마지막부터 증가하는 구간
    static void LIS2(int n) {
        for (int i = N - 1; i >= n; i--) {
            if (arr[i] < arr[n]) {
                dp2[n] = Math.max(dp2[n], dp2[i] + 1);
            }
        }
    }
}