import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        String word = br.readLine();

        int cnt = 0;

        for (int i = 0; i <= file.length() - word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (file.charAt(i + j) != word.charAt(j)) break;
                else if (j == word.length() - 1) {
                    cnt++;
                    i += word.length() - 1;
                }
            }
        }

        System.out.println(cnt);

    }

}






