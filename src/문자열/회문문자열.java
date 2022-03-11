package 문자열;

import java.util.Scanner;

public class 회문문자열 {
    public static void main(String[] args) {

        StringBuffer sb = null;
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        word = word.toUpperCase();
        sb = new StringBuffer(word);
        if (word.equals(sb.reverse()
        .toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
