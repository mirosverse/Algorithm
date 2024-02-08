import java.io.*;
import java.util.*;

class Main {
    static int[] lines;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        lines = new int[K];

        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
        }

        long l = 0, r = 1L << 31, ans = 0;
        while (l <= r) {
            long m = (l + r) / 2;
            if (isPossible(m)) {
                ans = m;
                l = m + 1;
            } else r = m - 1;
        }

        System.out.println(ans);
    }

    static boolean isPossible(long height) {
        long cnt = 0;
        for (int line : lines) {
            cnt += line / height;
        }

        return cnt >= N;
    }


}