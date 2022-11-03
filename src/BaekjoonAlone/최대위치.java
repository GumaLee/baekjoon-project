package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대위치 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int tmp;

        for(int i = 0; i < 9; i++) {
            tmp = Integer.parseInt(br.readLine());
            if(tmp >0 && tmp < 100)
                arr[i] = tmp;
            else
                System.exit(0);
        }

        int max = arr[0];
        int cnt = 0;

        for(int i = 0; i < 9; i++) {
            if(max < arr[i]) {
                max = arr[i];
                cnt = i;
            }
        }

        System.out.println(max);
        System.out.print(cnt + 1);
    }
}
