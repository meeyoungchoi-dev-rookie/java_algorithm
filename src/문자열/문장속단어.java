package 문자열;

import java.util.Scanner;

public class 문장속단어 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] strArray = str.split(" ");

        int distance = 0;

        String answer = "";
        for (String data : strArray) {
            if (distance < data.length()) {
                distance = data.length();
                answer = data;
            }
        }

        System.out.println(answer);

    }
}
