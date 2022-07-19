package 프로그래머스.level1;

import java.util.Locale;
import java.util.Scanner;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String answer = solution(word);
        System.out.println(answer);
    }

    public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] strArr = s.split("");

        for (String str : strArr) {
            if (str.contains(" ")) {
                cnt = 0;
            } else {
                cnt ++;
            }

            if (cnt % 2 == 0) {
                answer += str.toLowerCase();
            } else {
                answer += str.toUpperCase();
            }
        }
        return answer;
    }
}
