package 배열;

import java.util.Scanner;

public class 보이는학생 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studenCount = scanner.nextInt();

        int[] heights = new int[studenCount];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextInt();
        }



        int showCount = 1;
        int max = heights[0];
        for (int i = 0; i < heights.length - 1; i++) {
           if (max < heights[i + 1]) {
                max = heights[i + 1];
                showCount += 1;
                System.out.println(heights[i + 1]);
            }
        }

        System.out.println("선생님이 볼 수 있는 최대 학생수: " + showCount);


    }
}
