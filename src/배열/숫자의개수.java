package 배열;

import java.util.Scanner;

public class 숫자의개수 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = a * b * c;
        System.out.println("result: " + result);

        String resultToStr = String.valueOf(result);

        char[] charArray = resultToStr.toCharArray();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] - '0' == i) {
                    count += 1;
                }
            }
            System.out.println(count);
        }


    }
}
