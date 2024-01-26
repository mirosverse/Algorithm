import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }

        List<Integer> key = new ArrayList<>(map.keySet());
        key.sort(((o1, o2) -> map.get(o2).compareTo(map.get(o1))));

        for (Integer i : key) {
            bw.write((i + " ").repeat(map.get(i)));
        }

        bw.flush();
        bw.close();
    }
}
