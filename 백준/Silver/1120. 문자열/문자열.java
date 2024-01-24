import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int min = A.length();
        for (int i = 0; i <= B.length() - A.length(); i++) {
            int match = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) match++;
            }
            min = Math.min(match, min);
        }

        System.out.println(min);
    }
}
