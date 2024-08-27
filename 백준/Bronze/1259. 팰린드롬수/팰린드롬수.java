import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while(!(line = br.readLine()).equals("0")){
            StringBuilder sb = new StringBuilder(line);
            if (sb.reverse().toString().equals(line)) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
