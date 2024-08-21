import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String bomb = br.readLine();
        bw.write(solve2(str, bomb));
        bw.flush();
        bw.close();
    }

    public static String solve2(String str, String bomb) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> buffer = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }


        int bombIdx = bomb.length() - 1;

        while (!stack.isEmpty()) {
            char cur = stack.pop();

            if (bomb.charAt(bombIdx) == cur) {
                bombIdx--;
                if (bombIdx < 0) {
                    bombIdx = bomb.length() - 1;

                    buffer.push(cur);
                    for (int i = 0; i < bomb.length(); i++) {
                        buffer.pop();
                    }

                    int len = Math.min(bomb.length(), buffer.size());
                    for (int i = 0; i < len; i++) {
                        stack.push(buffer.pop());
                    }
                    
                    continue;
                }
            } else {
                bombIdx =  bomb.length() - 1;
                if(cur == bomb.charAt(bombIdx)) bombIdx--;
            }

            buffer.push(cur);
        }

        if (buffer.isEmpty()) return "FRULA";

        StringBuilder sb = new StringBuilder();
        while (!buffer.isEmpty()) {
            sb.append(buffer.pop());
        }

        return sb.toString();
    }

}