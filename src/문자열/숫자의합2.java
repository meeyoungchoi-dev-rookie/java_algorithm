package 문자열;

import java.util.Scanner;

public class 숫자의합2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char[] charArray = new char[n];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scanner.next().charAt(0);
        }


        int answer = 0;
        for (int j = 0; j < charArray.length; j++) {
           answer +=  Character.getNumericValue(charArray[j]);
        }

        System.out.println("answer: " + answer);




    }
}
