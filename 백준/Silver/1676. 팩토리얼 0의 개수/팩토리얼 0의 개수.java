import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int count = 0;
        for (int i = 1; i <= N ; i++){
            count += solve(i);
        }

        System.out.println(count);
    }

    public static int solve(int n){
        if (n % 5 != 0) return 0;
        int count = 0;
        while ( n % 5 == 0){
            n/=5;
            count++;
        }
        return count; 
    }

    

}
