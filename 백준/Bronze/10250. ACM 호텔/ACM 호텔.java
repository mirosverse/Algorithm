import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 0; test_case < T; test_case++) {
            int H = sc.nextInt();   // 호텔의 층 수
            int W = sc.nextInt();   // 각 층의 방 수
            int N = sc.nextInt();   // 몇 번째 손님

            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;

            System.out.println(floor + String.format("%02d", room));
        }
    }

}