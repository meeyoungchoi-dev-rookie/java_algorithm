package 정렬;
import java.io.*;


public class 수정렬하기3 {
    public static void main(String[] args) throws Exception, IOException {

        int[] arr = new int[10000];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        for( int i = 0 ; i < num ; i++) {
            int a = Integer.parseInt(bf.readLine());
            arr[a-1]++;
        }
        for( int i = 0 ; i < 10000 ; i++) {
            for( int j = 0 ; j < arr[i] ; j++) {
                bw.write(i+1+"\n");
            }
        }
        bw.flush();
    }
}
