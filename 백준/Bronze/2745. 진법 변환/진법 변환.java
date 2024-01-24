import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        int ans = 0;

        int temp = 1;
        for (int i = N.length() - 1; i >= 0; i--) {
            char cur = N.charAt(i);
            ans += toDecimal(cur) * temp;
            temp *= B;
        }

        System.out.println(ans);

    }

    static int toDecimal(char c) {
        if ((int) c >= 'A')
            return (int) (c - 'A') + 10;
        else
            return Character.getNumericValue(c);
    }
}