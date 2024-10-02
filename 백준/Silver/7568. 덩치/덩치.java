import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] people = new int[n][2];
        
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i][0]= Integer.parseInt(st.nextToken());
            people[i][1]= Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int[] person : people){
            int count = 0;
            for (int i=0; i<n;i++){
                if(people[i][0] > person[0] && people[i][1] > person[1]) count++;
            }
            sb.append(count+1).append(" ");
        }

        System.out.println(sb.toString());
    }
}
