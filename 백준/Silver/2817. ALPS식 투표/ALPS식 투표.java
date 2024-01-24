import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> score = new HashMap<>();


//        int[] score = new int[26];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char name = st.nextToken().charAt(0);
            int votes = Integer.parseInt(st.nextToken());
            if (votes < (double) X * 0.05) continue;
            map.put((int) (name - 'A'), votes);
        }


        for (int i = 1; i <= 14; i++) {
            for (Integer name : map.keySet()) {
                score.put(map.get(name) / i, name);
            }
        }

        List<Integer> alps = new ArrayList<>(score.keySet());
        Collections.sort(alps, Collections.reverseOrder());

        int[] result = new int[26];

        for (int i = 0; i < 14; i++) {
            result[score.get(alps.get(i))]++;
        }


        for (int i = 0; i < 26; i++) {
            if(result[i]==0 && !map.containsKey(i)) continue;
            System.out.println((char) (i + 'A') + " " + result[i]);
        }
    }
}