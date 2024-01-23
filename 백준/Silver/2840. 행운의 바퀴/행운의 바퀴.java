import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Character[] wheel = new Character[N + 1];
        boolean isWheel = true;

        Arrays.fill(wheel, '?');

        int cur = 0;    // 현재 위치
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            cur += cnt - 1;
            cur = (cur % N) + 1;

            char c = st.nextToken().charAt(0);
            if (wheel[cur] != '?' && wheel[cur] != c) {
                isWheel = false;
                break;
            }

            wheel[cur] = c;
        }

        // 중복검사
        HashSet<Character> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if(wheel[i]!='?' && set.contains(wheel[i])) isWheel = false;
            set.add(wheel[i]);

        }

        if (!isWheel)
            System.out.println("!");
        else {
            for (int i = cur; i > 0; i--) {
                System.out.print(wheel[i]);
            }
            for (int i = N; i > cur; i--) {
                System.out.print(wheel[i]);
            }
        }

    }


}