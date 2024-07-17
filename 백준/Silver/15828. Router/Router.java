import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int cur;
        while ((cur = Integer.parseInt(br.readLine())) != -1) {
            if (cur == 0) {
                queue.poll();
            } else if (queue.size() == N) {
                continue;
            } else {
                queue.offer(cur);
            }
        }

        if (queue.isEmpty()) {
            System.out.printf("empty");
        } else {
            while (!queue.isEmpty()) {
                System.out.print(queue.poll()+" ");
            }
        }

    }

}

