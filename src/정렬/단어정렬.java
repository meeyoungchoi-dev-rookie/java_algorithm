package 정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 단어정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        String temp = "";
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        Arrays.sort(arr, Comparator.comparing(String::length));

        for(int i = 0; i<arr.length; i++) {
            if(temp.equals(arr[i])) {
                continue;
            }
            else {
                System.out.println(arr[i]);
                temp = arr[i];
            }
        }

    }
}
