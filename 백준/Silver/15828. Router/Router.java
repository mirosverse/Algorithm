import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int cur;
        while ((cur = Integer.parseInt(br.readLine())) != -1) {
            if (cur == 0) {
                queue.poll();
                continue;
            }
            if (queue.size() == N) continue;
            queue.add(cur);
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        if(sb.toString().equals("")) sb.append("empty");
        System.out.println(sb.toString());

    }
}