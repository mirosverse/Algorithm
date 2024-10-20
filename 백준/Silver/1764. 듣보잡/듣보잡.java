import java.io.*;
import java.util.*;

class Main {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        while(n-- > 0){
            set.add(br.readLine());
        }

        int answer = 0;
        List<String> list = new LinkedList<>();
        while(m-- >0){
            String name = br.readLine();
            if (set.contains(name)) {
                answer++;
                list.add(name);
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder(answer+"\n");
        for (String name : list){
            sb.append(name).append("\n");
        }
        System.out.println(sb.toString());
    }
}
