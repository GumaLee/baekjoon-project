package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCD {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 유클리드 호제법: 두 수가 서로를 나누어서 원하는 수를 얻어내는 것
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = (a < b) ? a : b;
        int gcd = 1; // 최소 공약수
        for(int i = 0; i <= min; i++) { // 둘 다 나눠지는 수 중 가장 큰 수를 찾는다
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        sb.append(String.valueOf(gcd));
        sb.append((a * b)/gcd);
    }
}
