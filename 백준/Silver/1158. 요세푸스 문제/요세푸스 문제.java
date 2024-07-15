import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    static int N, M;
    static int[] cost;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        StringBuilder sb = new StringBuilder("<");
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int cnt = 0;
        while (!list.isEmpty()) {
            cnt = (cnt + K -1) % list.size();
            int cur = list.remove(cnt);
            sb.append(cur).append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.printf(sb.toString());
    }

}

