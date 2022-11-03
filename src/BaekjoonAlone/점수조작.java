package BaekjoonAlone;

import java.io.*;
import java.util.*;

public class 점수조작 {
    public static void main(String args[]) throws IOException {
        // 가장 높은 점수 : M
        // 모든 점수 -> (점수/M) * 100

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목 수 -> 평균에 사용
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        if(N > 1000)
            System.exit(0);

        int arr[] = new int[N];
        int tmp;
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if(tmp < 0 && tmp > 100)
                System.exit(0);
            else if(tmp == 0)
                cnt++;
            else
                arr[i] = tmp;
        }

        // 적어도 하나의 값은 0보다 커야한다는 조건
        if(cnt == N) {
            System.out.println("모든 과목이 0, Error");
            System.exit(0);
        }

        Arrays.sort(arr);
        int max = arr[N-1];

        double arr2[] = new double[N];
        double sum = 0;
        double avg;

        for(int i = 0; i < N; i++) {
            arr2[i] = (double) arr[i] / max * 100;
            sum += arr2[i];
        }

        avg = sum / N;
        System.out.println(avg);
    }
}
