import java.io.*;
import java.util.*;

public class Main {
    static String[] command = {"enter", "leave"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Set<String> company = new HashSet<>();;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (input[1].equals(command[0]))
                company.add(input[0]);
            else
                company.remove(input[0]);
        }

        List<String> list = new ArrayList<>(company);
        Collections.sort(list,Collections.reverseOrder());
        for (String name : list) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
    }
}
