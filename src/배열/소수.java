package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        ArrayList<Integer> primeList = new ArrayList<>();


        int[] numbers = new int[number];
        int[] primeNumbers = new int[number + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int primeCount = 0;
       for (int j = 2; j < numbers.length; j++) {
           if (primeNumbers[j] == 0) {
                primeCount += 1;
               for (int k = j; k < numbers.length; k= k+ j) {
                   if (numbers[k] % j == 0) {
                       primeNumbers[k] = 1;
                   }
               }
           }
       }

      System.out.println("소수의 개수: " + primeCount);

    }
}
