package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2525
public class 오븐시계 {
    public static void main(String args[]) throws IOException {
        // A : 시
        // B : 분
        // C : 필요한 시간 (0 <= C <= 1000)

        // 입력 : 시작시간 & 수행시간 -> "A B" \n "C"

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        // A의 증가값 = (C+B) / 60

        int cycle = (C + B) / 60;
        int remain = (C + B) % 60;

        B = remain;

        if(cycle != 0){
            if(A + cycle >= 24)
                A = A + cycle - 24;
            else
                A = A + cycle;
        }
        System.out.println(A + " " + B);
    }
}
