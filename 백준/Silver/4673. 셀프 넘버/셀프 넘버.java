import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] dp = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);
            if (n < 10001)
                dp[n] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if (!dp[i]) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();

    }

    static int d(int n) {
        int value = n;
        while (n > 0) {
            value += n % 10;
            n /= 10;
        }
        return value;
    }
}
