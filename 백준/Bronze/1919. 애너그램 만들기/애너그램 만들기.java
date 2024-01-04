import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int answer = 0;

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        for (int i = 0; i < 26; i++) {
            answer += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(answer);
    }

    private static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)-'a']++;
        return count;
    }

}






