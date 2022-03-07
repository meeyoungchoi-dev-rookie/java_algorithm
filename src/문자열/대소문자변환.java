package 문자열;

import java.util.Locale;
import java.util.Scanner;

public class 대소문자변환 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();

        String upperWord =  word.toUpperCase(Locale.ROOT);

        char[] upperArray = upperWord.toCharArray();

        String answer = "";
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == upperArray[i]) {
                answer += Character.toLowerCase(wordArray[i]);
            } else {
                answer += Character.toUpperCase(wordArray[i]);
            }
        }

        System.out.println("answer: " + answer);


    }
}
