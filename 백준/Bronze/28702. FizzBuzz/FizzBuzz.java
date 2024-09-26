import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        for (int i = 0; i<3; i++){
            String line = br.readLine();
            if (line.equals("FizzBuzz") || line.equals("Fizz") || line.equals("Buzz")) continue;
            answer = Integer.parseInt(line) +3 - i;
        }

        String ans = String.valueOf(answer);
        if (answer % 3 == 0 && answer % 5==0) ans = "FizzBuzz";
        else if (answer % 3 == 0) ans = "Fizz";
        else if (answer % 5 == 0) ans = "Buzz";




        System.out.println(ans);

    }
}
