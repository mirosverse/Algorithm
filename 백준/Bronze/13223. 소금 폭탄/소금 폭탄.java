import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] now = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int[] target = Arrays.stream(br.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[3];

        if (now[0] > target[0] || (now[0] == target[0] && now[1] > target[1]) || (now[0] == target[0] && now[1] == target[1] && now[2] > target[2])) {
            target[0] += 24;
        }

        int time = (target[0] * 3600 + target[1] * 60 + target[2]) - (now[0] * 3600 + now[1] * 60 + now[2]);
        ans[0] = time / 3600;
        time %= 3600;
        ans[1] = time / 60;
        time %= 60;
        ans[2] = time;
        if (ans[0] == 0 && ans[1] == 0 && ans[2] == 0) ans[0] = 24;

        System.out.println(String.format("%02d:%02d:%02d", ans[0], ans[1], ans[2]));
    }

}






