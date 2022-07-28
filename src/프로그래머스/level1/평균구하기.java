package 프로그래머스.level1;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum /arr.length;
        return answer;
    }
}
