package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://st-lab.tistory.com/28

public class 덧셈 {
    public static void main(String args[]) throws IOException {
        // 횟수 받기
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 두 개
        int A, B;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            // 루브마다 A, B 입력
            st = new StringTokenizer(br1.readLine());
            // StringBuilder 에 값을 추가할 때, 자료형에 따라 따로 해야했다.
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if(A != 0 && B != 0) {
                sb.append(A + B);
                sb.append("\n");
            }
            else
                break;
        }

        System.out.println(sb);
    }
}