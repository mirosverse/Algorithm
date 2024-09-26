import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        while(n-- >0) list.add(Integer.parseInt(br.readLine()));

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i : list){
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}
