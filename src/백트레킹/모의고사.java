package 백트레킹;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers = new int[5];
        answers[0] = 1;
        answers[1] = 2;
        answers[2] = 3;
        answers[3] = 4;
        answers[4] = 5;

        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int[] scores = {0,0,0}; // 수포자들 답 맞은 개수
        // 비교
        for(int i = 0; i < answers.length; i++){
            // 인덱스를 비교해야 한다 (인덱스 규칙)
            if(first[i % 5] == answers[i]){ scores[0]++;}
            if(second[i % 8] == answers[i]){ scores[1]++;}
            if(third[i % 10] == answers[i]){ scores[2]++;}
        }

        int[] arr = new int[scores.length];
        for(int i = 0; i < scores.length; i++){
            arr[i] = scores[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(scores[i] == arr[2]){
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
      //  return answer;




    }
}
