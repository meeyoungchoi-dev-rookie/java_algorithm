package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] numbers = new String[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.next();
            numbers[i] = new StringBuffer(numbers[i]).reverse().toString();
        }

        int primeCount = 0;
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)  {
            if (Integer.parseInt(numbers[i]) != 1) {
                for (int j = 2; j <= Integer.parseInt(numbers[i]); j++) {
                    if (Integer.parseInt(numbers[i]) % j == 0) {
                        primeCount += 1;
                    }
                }

                if (primeCount  <= 1) {
                    primeList.add(Integer.parseInt(numbers[i]));
                }

                primeCount = 0;
            }
        }

        System.out.println("뒤집은 숫자중 소수: ");
        for (Integer data : primeList) {
            System.out.print(data + " ");
        }




    }
}
