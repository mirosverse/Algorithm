import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }


        StringBuilder sb = new StringBuilder("<");
        int count = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (++count % K == 0) {
                sb.append(cur).append(", ");
                continue;
            }
            queue.offer(cur);
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");

        System.out.println(sb.toString());
    }


}