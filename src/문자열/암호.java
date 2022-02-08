package 문자열;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wordLength = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();
        String answer = "";
        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordLength; i++) {

          String afterSubstring = word.substring(0 , 7);
          afterSubstring = afterSubstring.replace("#", "1").replace("*", "0");
          int after_2 = Integer.parseInt(afterSubstring, 2);

          char w = (char) after_2;
          answer += w;

          word = word.substring(7, word.length());
        }

        System.out.println("암호 해제후 단어: " + answer);
    }
}
