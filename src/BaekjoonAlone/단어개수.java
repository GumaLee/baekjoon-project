package BaekjoonAlone;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1152번 : https://www.acmicpc.net/problem/1152
public class 단어개수 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int wordCnt = 0;

        while(st.hasMoreTokens()) {
            st.nextToken();
            wordCnt++;
        }


        System.out.println(wordCnt);

//        // split이 문자 배열로 리턴하기 때문에 String[]으로 선언
//        String[] str = br.readLine().trim().split(" ");
//        System.out.println(str.length);
    }
}
