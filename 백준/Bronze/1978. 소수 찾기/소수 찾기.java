import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            if (isPrime(i)) ans++;
        }

        System.out.println(ans);

    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}