import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        Set<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (Integer x : set) {
            map.put(x, idx++);
        }

        for (int i = 0; i < N; i++) {
            bw.write(map.get(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}
