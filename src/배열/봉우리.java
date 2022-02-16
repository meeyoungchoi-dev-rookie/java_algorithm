package 배열;

import java.util.Scanner;

public class 봉우리 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[][] dobuleArray = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                dobuleArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(dobuleArray[i][j] + " ");
            }
            System.out.println();
        }

        int[] dx = {-1 , 0 , 1 , 0};
        int[] dy = {0 , -1, 0 , 1};

        int answer = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >=0 && nx <length && ny >=0 && ny < length && dobuleArray[nx][ny] >= dobuleArray[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer += 1;
                }


            }
        }

        System.out.println("봉우리 개수: " + answer);








    }
}
