package 브루트포스;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }



        }


    }
}
