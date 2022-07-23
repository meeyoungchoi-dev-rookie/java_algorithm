package 프로그래머스.level1;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));

    }


    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[index] = arr[i];
            index += 1;
        }
        return answer;
    }
}
