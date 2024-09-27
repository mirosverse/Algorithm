import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int five = 0, three = 0;
        five = N/5;

        while(five >= 0){
            if((N - five*5) %3 == 0) break;
            five--; 
        }
        
        int answer = 0;
        if (five == -1) answer = -1;
        else answer = five + (N-five*5)/3;

        System.out.println(answer);
    }
}
