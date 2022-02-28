package 프로그래머스;

public class 피로도 {

    public static boolean check[]; // 던전방문여부 체크를 위한 배열
    public static int ans = 0; // 던전을 돈 횟수를 저장하기 위한 변수

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visited = new boolean[dungeons.length];

        // 던전을 돈 순번을 담을 배열
        int[][] output = new int[dungeons.length][2];

        // 피로도 계산을 하고 순번을 센다
        // k : 피로도 , dungeons : 던전 배열
        play(k , dungeons, 0);

        return answer;
    }

    public void play(int tired, int[][] dungeons, int cnt ) {

        // 던전을 도는 순번 계산 => 가장 많은 수의 던전을 도는 방법
        for (int i = 0; i < dungeons.length; i++) {
            if (!check[i] && dungeons[i][0] <= tired) { // 1. 던전에 방문하지 않았다 (한번이라도 탐색한 곳은 다시 가지 않겠다)   2. 현재 피로도보다 필요 피로가 크면 던전을 돌 수 없다
                check[i] = true;// 던전을 방문배열에 저장
                System.out.println(check[i]);



                // 현재 피로도가 필요 피로도보다 많은 경우 던전을 다시 방문한다 => 메서드 재실행
                play(tired-dungeons[i][1], dungeons, cnt+1);
                //현재 피로도가 필요 피로도보다 작은 경우 재방문 하지 않음
                check[i] = false;
                System.out.println(check[i]);
            }
        }

        ans = Math.max(ans, cnt);

    }


    public static void main(String[] args) {

    }
}
