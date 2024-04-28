import java.io.*;
import java.util.*;

// A + B + C = X   =>  A + B = X - C
class Main {
    static int N, M;
    static int[] U, sums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        U = new int[N];

        for (int i = 0; i < N; i++) {
            U[i] = Integer.parseInt(br.readLine());
        }

        // A + B  ->  sums[]
        sums = new int[N * (N + 1) / 2];
        int sumIdx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sums[sumIdx++] = U[i] + U[j];
            }
        }

        Arrays.sort(sums);

        // X - C  -> target
        int ans = -1;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                int target = U[i] - U[j];
                if (isExist(target))
                    ans = Math.max(ans, U[i]);
            }
        System.out.println(ans);
    }

    static boolean isExist(int s) {
        int left = 0, right = sums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (sums[mid] < s) {
                left = mid + 1;
            } else if (sums[mid] > s) {
                right = mid - 1;
            } else return true;
        }
        return false;
    }
}

