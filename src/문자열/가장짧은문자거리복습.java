package 문자열;

import java.util.Scanner;

public class 가장짧은문자거리복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char t = scanner.next().charAt(0);


        char[] array = str.toCharArray();

        int[] result = new int[array.length];

        int d = 1;

        // 배열의 왼쪽 인덱스부터 순회하면서 t와 배열인덱스의 거리를 계산한다
        for (int i = 0; i<= array.length - 1; i++) {
            if (t == array[i]) {// 문자 하나와 배열의 인덱스에 저장된 데이터와 같은 지 비교한다
                d = 0;
                result[i] = d;
                d = 1;
            } else {
                result[i] = d;
                d += 1;
            }
        }

        System.out.println("왼쪽 기준으로 검사 했을때 결과값: ");
        for (int l : result) {
            System.out.print(l + " ");
        }

        System.out.println();
        // 오른쪽 인덱스부터 출발하여 배열을 순회하면서 기준 문자와의 거리를 계산하겠다
        for (int j = array.length - 1; j >= 0; j--) {
            if (t == array[j]) {
                d = 0;
                result[j] = d;
                d = 1;
            }

            if (result[j] > 2) {
                result[j] = d;
                d += 1;
            }
        }

        System.out.println("오른쪽 까지 순회한 결과값: ");
        for (int l : result) {
            System.out.print(l + " ");
        }
    }
}
