import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] children = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = 0;

            for (int i = 1; i <= 20; i++) {
                int cur = children[i];

                for (int j = i + 1; j <= 20; j++) {
                    if (children[j] < children[i]) ans++;
                }
            }

            System.out.println(test_case + " " + ans);
        }

    }


}






