package 문자열;

import java.util.Scanner;

public class ShrinkWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word += " ";

        char[] wordArray = word.toCharArray();

        int equalCount = 1;

        String answer = "";
        for (int i = 0; i < wordArray.length - 1; i++) {
            if (wordArray[i] == wordArray[i + 1]) {
                equalCount += 1;
            } else {
                answer += wordArray[i];
                if (equalCount > 1) {
                    answer += String.valueOf(equalCount);
                    equalCount = 1;
                }
            }
        }

        System.out.println("문자열 압축결과: " + answer);


    }
}
