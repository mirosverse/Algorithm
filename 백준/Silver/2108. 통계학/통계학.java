import java.util.*;
import java.io.*;

class Main {

    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] oft = new int[8002];
        int sum = 0, max = -4000, min = 4000;


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
            oft[arr[i]+4000]++;
        }


        int mod=-1;
        int maxCnt = -1;
        boolean isAlready = false;
        for (int i = 0; i < 8002; i++) {
            if (oft[i] > maxCnt) {
                maxCnt = oft[i];
                mod = i;
                isAlready = false;
            }
            else if (oft[i] == maxCnt && !isAlready) {
                isAlready = true;
                mod=i;
            }
        }


        Arrays.sort(arr);
        int avg = Math.round((float) sum / n);
        int mid = arr[(n - 1) / 2];
        mod -= 4000;
        int sub = arr[n - 1] - arr[0];
        System.out.println(avg + "\n" + mid + "\n" + mod + "\n" + sub);


    }
}
