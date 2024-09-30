import java.util.*;
import java.io.*;

class Main {
    static boolean[] prime;

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        init(N);
        for (int i=M;i<=N;i++){
            if(prime[i]) System.out.println(i);
        }
    }

    public static void init(int n){
        prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i<= Math.sqrt(n); i++){
            if(prime[i]){
                for (int j = i*i; j<=n; j+=i){
                    prime[j] = false;
                }
            }
        }
    }
}
