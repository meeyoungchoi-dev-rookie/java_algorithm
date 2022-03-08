package 백트레킹;

import java.util.Scanner;

public class 스도쿠 {
    public static int[][] arr = new int[9][9];

    public static void main(String[] args) {

        // 입력받기 -> 함수 실행하기 -> 빈칸 찾기 -> 찾은 빈칸에 어떤 값이 들어가야 하는지 찾기 -> 찾은 값 대입하고 다음 빈칸 찾기 -> 완성된 배열 출력
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        sudoku(0, 0);// 행 , 열
    }
    public static void sudoku(int row, int col) {// 백트레킹 : 행과열을 계속 바꿔가면서 값을 찾는다

        // 해당 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
        if (col == 9) {
            sudoku(row + 1, 0);// 8,8 끝 0 ~8 종료지점을 명확히 하기위해 + 1 
            return;
        }

        // 행과 열이 모두 채워졌을 경우 출력 후 종료
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            // 출력 뒤 시스템을 종료한다. (프로그램 자체 종료)
            System.exit(0);
        }

        // 만약 해당 위치의 값이 0 이라면 1부터 9까지 중 가능한 수 탐색
        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                // i 값이 중복되지 않는지 검사
                if (possibility(row, col, i)) {
                    arr[row][col] = i;
                    sudoku(row, col + 1);
                    //arr[row][col] = 0;// 게임이 안끝냈을때를 검사하기 위해 (일반적인 백트레킹 구조) (장단점이 있다)
                }
            }
            arr[row][col] = 0;// 게임이 안끝냈을때를 검사하기 위해 (일반적인 백트레킹 구조)
            return;
        }


        sudoku(row, col + 1);

    }

    public static boolean possibility(int row, int col, int value) {


        /**
         *    같은 행에 값이 있는가
         *
         *    같은 열에 값이 있는가
         *
         *    네모 박스에 값이 있는가
         * */




        // 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }

        // 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }

        /**
         * 0/3=0
         *
         * 1/3=0
         *
         * 2/3=0
         *
         * 3/3=1
         *
         * 4/3=1
         *
         * 5/3=1
         *
         * 6/3=2
         *
         * 7/3=2
         *
         * 8/3=2

         * */

        // 3*3 칸에 중복되는 원소가 있는지 검사
        // 7, 7
        // 0 , 1, 2 => 0  * 3 => 시작지점 좌표가 된다
        // 3, 4, 5 => 1
        // 6, 7, 8 => 2 * 3
        int set_row = (row / 3) * 3; // value가 속한 3x3의 행의 첫 위치
        int set_col = (col / 3) * 3; // value가 속한 3x3의 열의 첫 위치
        // row , col 0 ~ 8 3번째 검사 조건
        // 숫자의 좌표가 어떤 지점에 해당해야 하는지 시작좌표
    //1,1 => 0,0 ~ + 3 +3
        // 2,2 => 0,0 ~ 2,2 총 9개의 좌표 가 전부 0,0
        

        for (int i = set_row; i < set_row + 3; i++) {// 6 ~ 8
            for (int j = set_col; j < set_col + 3; j++) { // 6 ~ 8
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true; // 중복되는 것이 없을 경우 true 반환
    }
}
