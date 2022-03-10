package 문자열;

import java.util.Scanner;

public class 특정문자뒤집기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] array = word.toCharArray();

        int idx = 0;
        int j = array.length - 1;


        /**
         * 뒤집히면 안되는 경우
         * 1. array[idx]가 특수문자일 경우
         * 2. array[j]가 특수문자일 경우
         * 3. 둘다 특수문자일 경우

         * */
       while (idx < j) {

           if (String.valueOf(array[idx]).matches("[^a-zA-Z0-9\\s]")) {
               idx += 1;
           } else if (String.valueOf(array[j]).matches("[^a-zA-Z0-9\\s]")) {
               j-= 1;
           } else {
               char temp = array[idx];
               array[idx] = array[j];
               array[j] = temp;
           }

           idx += 1;
           j -=1;
       }
        System.out.println("result = " + String.valueOf(array));

    }
}
