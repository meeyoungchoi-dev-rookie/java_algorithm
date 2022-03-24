package 배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int data : a) {
          for (int data2 : b) {
              if (data == data2) {
                  arrayList.add(data2);
              }
          }
        }

        Collections.sort(arrayList);

        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
    }
}

