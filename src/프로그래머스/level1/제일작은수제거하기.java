package 프로그래머스.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));

    }


    public static int[] solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        //ArrayList를 이용하여 최솟값과 같지 않은 수만 추가
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                list.add(arr[i]);
            }
        }

        int[] answer;
        // 경우를 나눠서 배열에 값을 저장하기
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
