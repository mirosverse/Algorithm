import java.io.*;
import java.util.*;

class Main {
    static int N, M, T, K, a, b;
    static char[][] region;
    static int[][] acc;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        region = new char[N][M];
        for (int i = 0; i < N; i++) {
            region[i] = br.readLine().toCharArray();
        }


        while (T-- > 0) {
            solveAcc();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 현재 칸에 생명이 있을 때  && ( 고독 OR 과밀 )
                    if (region[i][j] == '*' && (acc[i][j] < a || acc[i][j] > b)) {
                        region[i][j] = '.';
                    } else if (region[i][j] == '.' && (acc[i][j] > a && acc[i][j] <= b)) {
                        region[i][j] = '*';
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (char[] chars : region) {
            for (char c : chars) {
                bw.write(c);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    // 주위의 누적합 구함
    static void solveAcc() {
        acc = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (region[i][j] == '*') {
                    findLife(i, j);
                }
            }
        }
    }

    private static void findLife(int i, int j) {
        for (int k = i - K; k <= i + K; k++) {
            if (k >= N || k < 0) continue;
            for (int l = j - K; l <= j + K; l++) {
                if (l >= M || l < 0) continue;
                acc[k][l]++;
            }
        }
        acc[i][j]--;
    }

    static void increaseACC() {

    }


}

