package 문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class 중복문자제거 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] str_array = str.split("");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str_array.length; i++) {

            if (list.contains(str_array[i])) {
                continue;
            } else {
                list.add(str_array[i]);
            }
        }

        for (String data : list) {
            System.out.print(data);
        }
    }
}
