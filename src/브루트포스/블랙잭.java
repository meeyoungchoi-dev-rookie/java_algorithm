package 브루트포스;

import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cardCount = scanner.nextInt();

        int maxNum = scanner.nextInt();

        int[] numbers = new int[cardCount];

        for (int  i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }


        int max = 0;
        int sum = 0;
        for (int i = 0; i <= numbers.length - 3; i++) {
            System.out.println("i " + i);
            sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            System.out.println("sum " + sum);
            if (max < sum && maxNum >= sum) {
                max = sum;
                if (maxNum == sum) {
                    max = sum;
                    break;
                } else {
                    continue;
                }

            }
            System.out.println("max: " + max);
        }

        System.out.println(maxNum + "을 넘지 않으면서 " + maxNum + "에 가까운 카드 3장의 합: " + max);




    }
}
