import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static Integer[] arr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            int X = Integer.parseInt(st.nextToken());
            boolean ans = isExist(X);
            System.out.println(ans ? 1 : 0);
        }
    }

    private static boolean isExist(int X) {
        int l = 0, r = N - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < X) l = mid + 1;
            else if (arr[mid] > X) r = mid - 1;
            else return true;
        }
        return false;
    }

}