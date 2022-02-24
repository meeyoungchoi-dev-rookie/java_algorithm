package 배열;


import java.util.Scanner;

public class 임시반장정하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();

        int[][] grades = new int[6][students + 1];


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        for (int k = 1; k < 6; k++) {
            int count = 0;
            for (int s = 1; s < 6; s++) {
                    for (int g = 1; g < 6; g++) {
                        if (grades[k][g] == grades[s][g]) {
                            count += 1;
                            break;

                        }
                    }
            }

            if (count > max) {
                max = count;
            }



            System.out.println(k + "번 학생과 같은 반이였던 학생수 : " + count);
        }

        System.out.println("result: " + max);
    }

}
