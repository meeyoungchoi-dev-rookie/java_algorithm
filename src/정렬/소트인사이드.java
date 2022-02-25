package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 소트인사이드 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();


        char[] array = n.toCharArray();
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }





    }
}
