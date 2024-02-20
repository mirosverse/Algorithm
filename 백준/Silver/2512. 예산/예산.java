import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] requests;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        requests = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            requests[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());

        Arrays.sort(requests);

        int l = 1, r = requests[N - 1], ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (calc(m) >= 0) {
                ans = m;
                l = m + 1;
            } else r = m - 1;
        }

        System.out.println(ans);

    }

    static int calc(int limit) {
        int money = M;
        for (int request : requests) {
            if (request > limit) money -= limit;
            else money -= request;
        }
        return money;
    }


}