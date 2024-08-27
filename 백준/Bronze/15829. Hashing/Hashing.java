import java.io.*;
import java.math.BigInteger;

class Main {

    static int L, R = 31, MOD = 1234567891;
    static BigInteger answer = BigInteger.ZERO;
    static BigInteger bigR = BigInteger.valueOf(R);
    static BigInteger bigMOD = BigInteger.valueOf(MOD);

    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        for (int i = 0; i < L; i++) {
            int a = str.charAt(i) - 'a' + 1;
            BigInteger b = bigR.pow(i).mod(bigMOD); 
            answer = answer.add(BigInteger.valueOf(a).multiply(b)).mod(bigMOD);
        }

        System.out.println(answer);

    }
}
