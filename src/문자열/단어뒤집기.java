package 문자열;

import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {

        StringBuffer sb = null;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] wordArray = new String[n];

        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = scanner.nextLine();

        }

        for (int j = 0; j < wordArray.length; j++) {
            sb = new StringBuffer(wordArray[j]);
            String reverse = sb.reverse().toString();
            wordArray[j] = reverse;
        }

        for (String data : wordArray) {
            System.out.println(data);
        }



    }
}
