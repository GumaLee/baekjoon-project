package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 정렬을 사용하지 않는다면 이중 포문으로 쭉 비교하고 그 결과가 ?이면 cnt 증가시키고 이런 식으로

public class 나머지배열 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        int tmp;
        int cnt = 1;

        // 입력한 수의 나머지 배열 생성
        for(int i = 0; i < 10; i++) {
            tmp = Integer.parseInt(br.readLine());
            if(tmp >0 && tmp < 1001)
                arr[i] = tmp % 42;
            else
                System.exit(0);
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        for(int i = 1; i < 10; i++) {
            if(arr[i] != arr[i-1])
                cnt++;
        }

        System.out.println(cnt);
    }
}
