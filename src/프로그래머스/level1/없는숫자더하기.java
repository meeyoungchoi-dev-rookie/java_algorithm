package 프로그래머스.level1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int num = 45;
        for (int i : numbers) {
            num -= i;
        }
        return num;
    }
}
