package 배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 격자판최대합복습 {
    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // 가로
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
               sum += array[i][j];
            }
            data.add(sum);
        }

        // 세로
        // 00 10 20 30 40
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            data.add(sum);
        }

        // 대각선
        // 00 11 22 33 44
        sum = 0;
        int y = 0;
        int x = 0;
        while (y < array.length && x < array.length) {
            sum += array[x][y];
            y += 1;
            x += 1;
        }
        data.add(sum);

        // 반대각선
        // 04 13 22 31  40
        sum = 0;
        y = 0;
        x = array.length - 1;
        while (y < array.length && x >= 0) {
            sum += array[x][y];
            y += 1;
            x -= 1;
        }
        data.add(sum);
        System.out.println(Collections.max(data));
    }
}