package BaekjoonAlone;
// https://www.acmicpc.net/problem/2480

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위세개 {
    public static void main(String args[]) throws IOException {
        /*
        <주사위 3개>
        같은 눈이 3개 : 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        같은 눈이 2개 : 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        모두 다른 눈  : (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int C = Integer.parseInt(token.nextToken());

        int prize;

        if (A == B && B == C)
            prize = 10000 + (A * 1000);
        else if (A == B || A == C || B == C) {
            if(A == B || A == C)
                prize = 1000 + (A * 100);
            else
                prize = 1000 + (B * 100);
        }
        else {
            int L = A;

            if(L < B)
                L = B;

            if(L < C)
                L = C;

            prize = L * 100;
        }

        System.out.println(prize);
    }
}
