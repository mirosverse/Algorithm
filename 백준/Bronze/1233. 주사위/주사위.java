import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] diceSum = new int[81];

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    diceSum[i + j + k]++;
                }
            }
        }

        int max = 0, maxIdx = 0;
        for (int i = 1; i <= 80; i++) {
            if (max < diceSum[i]) {
                max = diceSum[i];
                maxIdx = i;
            }
        }

        System.out.println(maxIdx);
    }
}