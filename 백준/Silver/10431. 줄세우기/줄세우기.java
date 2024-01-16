import java.io.*;
import java.util.*;

// 6 2 3 7 5 1 4   6 3
// 1 2 3 4 5 6 7

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] children = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = getAns(children);
            System.out.println(test_case + " " + ans);
        }

    }

    private static int getAns(int[] children) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int ans = 0;

        stack.push(children[1]);

        for (int i = 2; i <= 20; i++) {
            while (!stack.isEmpty() && stack.peek() > children[i]) {
                temp.push(stack.pop());
                ans++;
            }
            stack.push(children[i]);
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return ans;
    }
}






