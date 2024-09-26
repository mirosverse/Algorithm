import java.util.*;
import java.io.*;

class Main {

    static public void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = 1;
        for (int i=a -b+1;i<=a;i++) sum *= i;
        int mod = 1;
        for (int i = 1; i<=b; i++) mod *= i;

        System.out.println(sum/mod);

    }
}
