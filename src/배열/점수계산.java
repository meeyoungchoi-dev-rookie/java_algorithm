package 배열;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int questionCount = scanner.nextInt();

        int[] answers = new int[questionCount];

        for (int i = 0; i < answers.length; i++) {
            answers[i] = scanner.nextInt();
        }


        int okCount = 0;
        int total = 0;
        for (Integer data : answers) {
            if (data == 1) {
                okCount += 1;
                total = total +  okCount;
            } else {
                okCount = 0;

            }
        }

        System.out.println("총점: " + total);




    }
}
