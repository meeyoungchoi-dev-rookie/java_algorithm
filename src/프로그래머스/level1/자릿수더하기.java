package 프로그래머스.level1;

import java.util.Scanner;

public class 자릿수더하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = solution(number);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }
        return answer;
    }
}
