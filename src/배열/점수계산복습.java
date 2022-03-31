package 배열;

import java.util.Scanner;

public class 점수계산복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int questionCount = scanner.nextInt();
        int[] resultArray = new int[questionCount];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = scanner.nextInt();
        }

        int total = 0;
        int correctCount = 0;
        for (int j = 0; j < resultArray.length; j++) {
            if (resultArray[j] == 0) {
                correctCount = 0;
            } else {
                correctCount += 1;
            }
            total += correctCount;
        }

        System.out.println("총점 : " + total);
    }
}
