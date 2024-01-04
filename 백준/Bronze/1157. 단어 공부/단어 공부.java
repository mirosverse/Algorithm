import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] count = new int[26];
        for (char c : str.toUpperCase().toCharArray()) {
            count[c-'A']++;
        }

        int maxCount = Arrays.stream(count).max().getAsInt();
        String answer = "";

        for (int i = 0; i < 26; i++) {
            if (maxCount == count[i]) {
                if(!answer.isEmpty()) {
                    System.out.println("?");
                    return;
                }
                else answer = String.valueOf(i);
            }
        }

        System.out.println((char) (Integer.parseInt(answer) +'A'));

    }

}






