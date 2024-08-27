import java.io.*;
import java.util.*;

class Main {

    static int L, R = 31, MOD = 1234567891, answer = 0;

	static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        for (int i = 0; i< str.length(); i++){
            int a = str.charAt(i) - 'a' + 1;
            answer += a * Math.pow(R, i) % MOD;
        }

        System.out.println(answer);

    }
}