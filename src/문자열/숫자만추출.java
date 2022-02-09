package 문자열;

import java.util.Scanner;

public class 숫자만추출 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        char[] wordArray = word.toCharArray();
        String result = "";

        for (int i = 0; i < wordArray.length; i++) {
            if (Character.isDigit(wordArray[i])) {
                result += wordArray[i];
            }
        }

        System.out.println("숫자만 추출한 결과: " + Integer.parseInt(result));
    }
}
