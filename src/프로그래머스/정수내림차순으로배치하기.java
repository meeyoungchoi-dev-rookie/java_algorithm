package 프로그래머스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();

        Long answer;
        String data = Long.toString(n);

        String[] array = data.split("");

        Arrays.sort(array , Collections.reverseOrder());

        data = String.join("", array);
         answer = Long.parseLong(data);
        System.out.println(answer);
    }
}
