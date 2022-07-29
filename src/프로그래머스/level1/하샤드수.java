package 프로그래머스.level1;

import java.io.IOException;

public class 하샤드수 {
    public boolean solution (int x) throws IOException {
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }

        if (x % sum == 0) {
            return true;
        } else
            return false;
    }
}
