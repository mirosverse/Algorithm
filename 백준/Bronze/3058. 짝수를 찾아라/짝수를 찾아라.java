import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0, min = 101;
            for (int i = 0; i < 7; i++) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    sum += n;
                    if (min > n) min = n;
                }
            }
            System.out.println(sum + " " + min);
        }

    }
}