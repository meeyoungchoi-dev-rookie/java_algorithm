package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 수정렬하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int data : numbers) {
            System.out.println(data);
        }


    }
}
