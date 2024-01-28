import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] serial = new String[N];
        for (int i = 0; i < N; i++) {
            serial[i] = br.readLine();
        }

        Arrays.sort(serial, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int a = 0, b = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        if (!Character.isDigit(o1.charAt(i))) continue;
                        a += o1.charAt(i) - '0';
                    }

                    for (int i = 0; i < o2.length(); i++) {
                        if (!Character.isDigit(o2.charAt(i))) continue;
                        b += o2.charAt(i)-'0';
                    }

                    if (a != b) return a-b;

                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (String s : serial) {
            System.out.println(s);
        }

    }
}
