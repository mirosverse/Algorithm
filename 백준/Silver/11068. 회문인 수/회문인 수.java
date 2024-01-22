import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            boolean found = false;

            for (int B = 2; B <= 64; B++) {
                sb = new StringBuilder();
                int N = n;

                while (N >= B) {
                    N = change(N, B);
                }
                change(N, B);

                if (sb.toString().equals(sb.reverse().toString())) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? 1 : 0);
        }

    }

    static int change(int n, int B) {
        if (n % B >= 10) sb.append((char) ('A' + (n % B - 10)));
        else sb.append(n % B);
        return n / B;
    }
}