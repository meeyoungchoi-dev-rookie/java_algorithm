package 프로그래머스.level1;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
}
