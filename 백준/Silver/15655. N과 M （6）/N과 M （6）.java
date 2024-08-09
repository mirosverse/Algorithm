import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	static int N, M;
	static int[] arr, answer;
	static boolean[] isVisited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		answer = new int[M];
		isVisited = new boolean[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		perm(0, 0);
	}

	public static void perm(int depth, int start) {
		if (depth == M) {
			print(answer, M);
			return;
		}

		for (int i = start; i < N; i++) {
			if (!isVisited[i]) {
				isVisited[i] = true;
				answer[depth] = arr[i];
				perm(depth + 1, i + 1);
				isVisited[i] = false;
			}
		}
	}

	public static void print(int[] array, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(array[i]).append(" ");
		}
		System.out.println(sb);
	}

}