import java.io.*;
import java.util.*;

public class Main {
    static int B;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        B = sc.nextInt();


        while (N >= B) {
            N = change(N);
        }
        change(N);

        System.out.println(sb.reverse().toString());
    }

    static int change(int n) {
        if (n % B >= 10) sb.append((char) ('A' + (n % B - 10)));
        else sb.append(n % B);
        return n / B;
    }
}