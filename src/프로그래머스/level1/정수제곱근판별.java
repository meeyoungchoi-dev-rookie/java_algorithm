package 프로그래머스.level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n); // 제곱해서 n이 되는 수를 구한다

        if (Math.pow(sqrt, 2) == n) { // sqrt의 제곱근과 n이 같은지 비교한다
            return (long)Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}
