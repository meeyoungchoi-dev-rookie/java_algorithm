package 문자열;

import java.util.Scanner;

public class 숫자의합3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String data = scanner.next();
        int  sum = 0;
        for (int i = 0; i < n; i++) {
           sum  += data.charAt(i) -  '0'; // 해당 문자열의 인덱스 값을 int 형으로 변환한다
        }
        System.out.println("sum: " + sum);

    }
}
