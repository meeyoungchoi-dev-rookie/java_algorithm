package 배열;

import java.util.Scanner;

public class 가위바위보 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int gameCount = scanner.nextInt();

        int[] aArray = new int[gameCount];
        int[] bArray = new int[gameCount];

        for (int i = 0; i < aArray.length; i++) {
            aArray[i] = scanner.nextInt();
        }

        for (int k = 0; k < bArray.length; k++) {
            bArray[k] = scanner.nextInt();
        }

        String answer = "";
        int g = 1;
        int aIndex = 0;
        int bIndex = 0;
        while (g <= gameCount) {

            if (aArray[aIndex] == bArray[bIndex]) {
                answer += "D\n";
            } else if (aArray[aIndex] == 2 && bArray[bIndex] == 1) { // A가 이기는 경우
                answer += "A\n";
            } else if (aArray[aIndex] == 3 && bArray[bIndex] == 2) {
                answer += "A\n";
            } else { // A가 이기는 경우에 해당하지 않는 경우 B가 이기게 된다
                answer += "B\n";
            }

            aIndex += 1;
            bIndex += 1;
            g += 1;
        }

        System.out.println("승자");
        System.out.print(answer);







    }
}
