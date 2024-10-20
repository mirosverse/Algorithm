import java.io.*;
import java.util.*;

class Main {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();  // StringBuilder 생성
        int m = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        
        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            Integer x = (st.hasMoreElements()) ? Integer.parseInt(st.nextToken()) : null;
            
            switch (command) {
                case "add":
                    set.add(x);
                    break;
                case "remove":
                    set.remove(x);
                    break;
                case "check":
                    int n = (set.contains(x)) ? 1 : 0;
                    sb.append(n).append("\n");  
                    break;
                case "toggle":
                    if (set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
                    break;
                case "empty":
                    set = new HashSet<>();
                    break;
            }
        }

        System.out.print(sb.toString());  
    }
}
