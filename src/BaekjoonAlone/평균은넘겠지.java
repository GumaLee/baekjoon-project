package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4344
// 반올림 : https://coding-factory.tistory.com/250

public class 평균은넘겠지 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int num, sum = 0;
        double avg, ratio;
        int cnt = 0;


        int arr[] = new int[1000];

        for(int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            for(int j = 0; j < num; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            avg = sum/num;

            for(int k = 0; k < num; k++) {
                if(arr[k] > avg)
                    cnt++;
            }

            ratio = ((double)cnt/num) * 100; // 소수점까지 알고 싶으면 하나라도 실수면 된다.

            sb.append(String.format("%.3f", ratio));
            sb.append("%\n");
            sum = 0;
            cnt = 0;
        }
        System.out.println(sb);
    }
}
