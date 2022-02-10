package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();

        int[] arr = new int[numberCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                arrayList.add(arr[i + 1]);
            }
        }

        for (Integer data : arrayList) {
            System.out.print(data + " ");
        }


    }
}
