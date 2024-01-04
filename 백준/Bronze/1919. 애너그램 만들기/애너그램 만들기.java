import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
            } else
                map.put(a.charAt(i),1);
        }

        for (int i = 0; i < b.length(); i++) {
            char cur = b.charAt(i);
            if (map.containsKey(cur)) {
                if(map.get(cur) == 1) map.remove(cur);
                else map.put(cur, map.get(cur) - 1);
            } else answer++;
        }

        for (Integer value : map.values()) {
            answer+=value;
        }

        System.out.println(answer);

    }

}






