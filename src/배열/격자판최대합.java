package 배열;

import java.util.Scanner;

public class 격자판최대합 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] dobuleArray = new int[n][n];

        int[] lineSumAray = new int[n + n + 2];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dobuleArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dobuleArray[i][j] + " " );
            }
            System.out.println();
        }


        // 가로 줄의 합
        int sum = 0;
        int lineNum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += dobuleArray[i][j];
            }
            lineSumAray[lineNum] = sum;
            lineNum += 1;
            System.out.println("가로 줄의 합: " + sum);
            sum = 0;
        }


        // 세로 줄의 합
        sum = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                sum += dobuleArray[i][k];
            }
            lineSumAray[lineNum] = sum;
            lineNum += 1;
            System.out.println("세로 줄의 합: " + sum);
            sum = 0;
        }

        // y -> x 방향 대각선의 합
        sum = 0;

        int x = 0;
        int y = 0;
        while (x < n && y < n) {
            sum += dobuleArray[x][y];
            x += 1;
            y += 1;
        }
        System.out.println("정방향 대각 선의 합: " + sum);
        lineSumAray[lineNum] = sum;
        lineNum += 1;


        // 역방향 대각선의 합
        x = 0;
        y = n -1;
        sum = 0;
        while (x < n && y >= 0) {

            sum += dobuleArray[x][y];
            x += 1;
            y -= 1;

        }
        System.out.println("역방향 대각 선의 합: " + sum);
        lineSumAray[lineNum] = sum;

        for (int i = 0; i < lineSumAray.length; i++) {
            System.out.println(lineSumAray[i]);
        }

        int maxSum = 0;
        for (int i = 0; i <= lineSumAray.length - 1; i++) {
            if (maxSum < lineSumAray[i]) {
                maxSum = lineSumAray[i];
            }
        }

        System.out.println("가장 큰 합: " + maxSum);




    }
}
