import java.util.*;
import java.io.*;

class Main {
    static int[][] dp;

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new int[15][15];

        for (int i =  0; i< 15; i++) dp[0][i] = i;
        for (int i = 1; i<15;i++){
            for (int j=1;j<15;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
    
        int T = Integer.parseInt(br.readLine());
        while (T-->0){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[k][n]);
        }

    }
}
