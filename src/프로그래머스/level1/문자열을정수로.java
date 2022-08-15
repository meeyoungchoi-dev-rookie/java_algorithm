package 프로그래머스.level1;

public class 문자열을정수로 {
    public int solution(String s) {
        return s.matches("\\+?[1-9][0-9]{0,4}") ?
                Integer.parseInt(s) : Integer.parseInt(s.replace("-", ""))*-1;
    }
}
