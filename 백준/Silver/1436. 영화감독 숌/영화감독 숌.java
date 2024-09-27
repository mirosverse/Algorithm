import java.util.*;
import java.io.*;

// 1666, 6066, 6660, 6661, 
class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(solve(N));
    }

    public static int solve(int N){
        if (N == 1) return 666;
        if (N <= 6) return 1000 * (N - 1) + 666;

        int count = 6;
        int num = 6000;
        while ( count != N ){
            num++;
            if(String.valueOf(num).contains("666")) count++;
        }

        return num;
    }
}
