package 문자열;

import java.util.Scanner;

public class 숫자만추출복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        char[] charArray = data.toCharArray();

        String result = "";

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                result += String.valueOf(charArray[i]);
            }
        }

        System.out.println("result: " +result.replaceFirst("^0+(?!$)", ""));
    }
}
