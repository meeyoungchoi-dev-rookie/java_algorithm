package 문자열;

import java.util.Scanner;

public class 문자열압축 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String answer = "";

        char[] wordArray = word.toCharArray();
        String str = "";
        boolean status = true;
        int equalCount = 1;
        for (int i = 1; i <= wordArray.length - 1; i++) {
            char data = wordArray[i];
            for(int j =  0; j <= i; j++ ) {
                if (data == wordArray[j]) {
                    equalCount += 1;
                } else  {
                    status = false;
                }
            }

            if (status == false) {
                str += data;
                answer += str +  String.valueOf(equalCount);
                equalCount = 1;
            }

        }

        System.out.println("압축전: " + word);
        System.out.println("압축결과: " + answer);


    }
}
