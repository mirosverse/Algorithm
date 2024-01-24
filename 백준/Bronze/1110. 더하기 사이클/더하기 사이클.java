import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(N);
        int cur = N, cnt = 0;

        do {
            int sum = 0;
            if (cur < 10) {
                sum = cur;
            } else {
                sum = cur % 10 + cur / 10;
            }
            cur = cur % 10 * 10 + sum % 10;
            cnt++;
        } while (cur != N);

        System.out.println(cnt);
    }
}
