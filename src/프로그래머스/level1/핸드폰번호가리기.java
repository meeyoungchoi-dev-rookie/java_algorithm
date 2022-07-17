package 프로그래머스.level1;

import java.util.Scanner;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneNumber = scanner.next();
        String answer = "";

        for (int i = 0; i < phoneNumber.length(); i++) {
            if (i < phoneNumber.length() - 4) {
                answer += "*";
            } else {
                answer += phoneNumber.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
