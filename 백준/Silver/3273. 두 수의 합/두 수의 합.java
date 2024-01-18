import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        boolean[] exist = new boolean[1000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            exist[arr[i]] = true;
        }

        int x = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 1; i <= (x - 1) / 2; i++) {
            if (i <= 1000000 && x - i <= 1000000) {
                ans += (exist[i] && exist[x - i]) ? 1 : 0;
            }
        }

        System.out.println(ans);

    }
}