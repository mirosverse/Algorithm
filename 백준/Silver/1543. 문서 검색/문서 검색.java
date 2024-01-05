import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file = br.readLine();
        String word = br.readLine();

        String replaced = file.replace(word, "");
        int count = (file.length() - replaced.length()) / word.length();


        System.out.println(count);
    }

}






