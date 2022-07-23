package 배열;

import java.util.Scanner;

public class 멘토링 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] scoreArrayRank = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                scoreArrayRank[i][j] = scanner.nextInt();
            }
        }



        int answer = 0;
        for (int s = 1; s <= n; s++) {
            for (int s2 = 1; s2 <= n; s2++) {
                int cnt = 0;
                for (int k = 0; k < n; k++) {
                    int g1 = 0;
                    int g2 = 0;

                    for (int j = 0; j < m; j++) {
                        if (scoreArrayRank[k][j] == s) {
                            g1 = s;
                        }

                        if (scoreArrayRank[k][j] == s2) {
                            g2 = s2;
                        }
                    }
                    if (g2 < g1) {
                        cnt += 1;
                    }

                }
                if (cnt == m) {
                    answer += 1;
                }
            }
        }

        System.out.println("짝을 만들 수 있는 총 경우의 수: " + answer);







    }
}
