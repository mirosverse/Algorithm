import java.io.*;
import java.util.*;

// -99 -98 -2 -1 4 98

class Main {
    static long[] values;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        values = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            values[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(values);
        long optimal = 2000000000;
        long[] answer = {-1, -1};
        for (int i = 0; i < N-1; i++) {
            int idx = find(i);
            long sum = Math.abs(values[idx] + values[i]);
            if (sum < optimal) {
                optimal = sum;
                answer = new long[]{values[i], values[idx]};
            }
        }

        System.out.println(answer[0] + " " + answer[1]);

    }

    static int find(int X) {
        int l = X + 1, r = N - 1, ans = X + 1;
        long optimal = 2000000000;
        while (l <= r) {
            int mid = (l + r) / 2;
            long sum = values[X] + values[mid];
            if (Math.abs(sum) < optimal) {
                ans = mid;
                optimal = Math.abs(sum);
            }
            if (sum > 0) r = mid - 1;
            else if (sum < 0) l = mid + 1;
            else return mid;
        }
        return ans;
    }

}