import java.io.*;
import java.util.*;

public class Main {
    static String[] command = {"enter", "leave"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (map.get(o1) == map.get(o2)) return o1.compareTo(o2);
            return map.get(o2) - map.get(o1);
        });

        System.out.println(list.get(0));
        
    }
}
