package 문자열;

import java.util.Scanner;

public class 유효한팰린드롬 {
    public static void main(String[] args) {

        StringBuffer sb = null;
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        // 특수문자 제거
        String match = "[^\\uAC00-\\uD7A30-9a-zA-Z]";
        sentence = sentence.replaceAll(match, " ");

        System.out.println("특수문자 제거후: " + sentence);

        // 공백제거
        sentence = sentence.replaceAll(" ", "");
        System.out.println("공백제거후: " + sentence);

        // 대문자로 변환
        String upperCase = sentence.toUpperCase();
         sb = new StringBuffer(upperCase);
        System.out.println("대문자 변환후: " + upperCase.toString());
        String reverse = sb.reverse().toString();
        System.out.println("뒤집은 문자열: " + reverse);
         if (upperCase.equals(reverse)) {
             System.out.println("YES");
         } else {
             System.out.println("NO");
         }

    }
}
