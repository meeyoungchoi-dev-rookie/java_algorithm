package 배열;

import java.util.Scanner;

public class 봉우리복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // 가로방향 이동 : 왼쪽  아래 오른쪽 위 (왼쪽 오른쪽만 이동가능)
        int[] x = {-1 , 0 , 1 ,0};

        // 세로방향 이동 : 왼쪽  아 오른쪽 위 (위 아래만 가능)
        int[] y = {0 , -1, 0 , 1};

        int result = 0;

        for (int j = 0; j < n; j++) { // 0 ,0
            for (int i = 0; i < n; i++) {
               boolean status = true;
                for (int k = 0; k < x.length; k++) {
                    int dx = i + x[k];//0 + x[0] => 0 + -1 => -1
                    int dy = j + y[k];//0 + y[0] => 0 + 0 => 0
                    if (dx >= 0 && dx < n && dy < n && dy >= 0 && array[dx][dy] >= array[i][j]) {
                        status = false;
                        break;
                    }
                }
                if (status) {
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
