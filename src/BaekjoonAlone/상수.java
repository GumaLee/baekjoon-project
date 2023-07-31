package BaekjoonAlone;

// 2908번 : https://www.acmicpc.net/problem/2908

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수 {
    public static void main(String args[]) throws IOException {
        // 세 자리 수를 거꾸로 비교
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // String[] nums = br.readLine().trim().split(" ");
        String num1 = st.nextToken();
        String num2 = st.nextToken();

        int arr1[] = new int[3];
        int arr2[] = new int[3];

        for(int i = 0; i < 3; i++) {
            arr1[i] = num1.charAt(i) - 48;
            arr2[i] = num2.charAt(i) - 48;
        }

        int revNum1 = 100*arr1[2] + 10*arr1[1] + arr1[0];
        int revNum2 = 100*arr2[2] + 10*arr2[1] + arr2[0];

        for(int i = 2; i >= 0; i--) {
            if(arr1[i] > arr2[i]) {
                System.out.println(revNum1);
                break;
            }
            else if(arr1[i] < arr2[i]) {
                System.out.println(revNum2);
                break;
            }
            else
                continue;
        }
    }
}
