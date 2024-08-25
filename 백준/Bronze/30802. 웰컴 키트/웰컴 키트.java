import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, T, P;
    static int[] shirts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        shirts = new int[6];
        for (int i = 0; i < shirts.length; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        int t=0, p;

        for (int i = 0; i < 6; i++) {
            t += shirts[i] / T;
            if (shirts[i] % T != 0) t++;
        }

        p = N / P;
        if (N % P != 0) p++;

        System.out.println(t);
        System.out.println(N / P + " " + N % P);

    }


}