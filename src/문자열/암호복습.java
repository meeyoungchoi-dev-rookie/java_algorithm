package 문자열;

import java.util.Scanner;

public class 암호복습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();
        scanner.nextLine();

        String str = scanner.nextLine();

        char[] array = str.toCharArray();

        String result = "";
        for (int i = 0; i < wordCount; i++) {

            String subStr = str.substring(0, 7);

            subStr = subStr.replace("#", "1").replace("*", "0");

            int str_10 = Integer.parseInt(subStr , 2);

            char alpabet = (char) str_10;
            result += alpabet;

            str = str.substring(7, str.length());
        }

        System.out.println("result: " + result);


    }
}
