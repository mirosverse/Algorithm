import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int ans = 0;

        if (A.length() == B.length()) {
            for (int i = 0; i < B.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) ans++;
            }
        } else {
            int max = A.length();
            for (int i = 0; i <= B.length() - A.length(); i++) {
                int match = 0;
                for (int j = 0; j < A.length(); j++) {
                    if (A.charAt(j) != B.charAt(i + j)) match++;
                }
                max = Math.min(match, max);
            }

            ans= max;
        }

        System.out.println(ans);
    }
}
