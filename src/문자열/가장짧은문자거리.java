package 문자열;

import java.util.Scanner;

public class 가장짧은문자거리 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char data = scanner.next().charAt(0);

        word = word.toLowerCase();
        data = Character.toLowerCase(data);

        char[] wordArray = word.toCharArray();

        int distance = 1000;
        int[] ltArray = new int[word.length()];
        for (int i = 0;i <= wordArray.length - 1; i++) {
           if (wordArray[i] == data) {
                distance = 0;
                ltArray[i] = distance;
           } else {
               if (i == 0 && wordArray[i] != data) {
                    distance = 1;
                    ltArray[i] = distance;
               } else {
                   distance += 1;
                   ltArray[i] = distance;
               }
           }
        }

        distance = 1000;
        for (int k = wordArray.length - 1; k >= 0; k--) {
            if (wordArray[k] == data) {
                distance = 0;
                ltArray[k] = distance;
            } else {
                distance += 1;
                if (ltArray[k] > distance) {
                    ltArray[k] = distance;
                }
            }
        }

        for (char c : wordArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int ltData : ltArray) {
            System.out.print(ltData + " ");
        }

    }
}
