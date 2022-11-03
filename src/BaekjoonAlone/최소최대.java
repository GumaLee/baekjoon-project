package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int min, max;
        int arr[] = new int[N];


        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        min = arr[0];
        max = arr[0];

        for(int i = 0; i < N; i++) {
            if(min > arr[i])
                min = arr[i];
        }

        for(int i = 0; i < N; i++) {
            if(max < arr[i])
                max = arr[i];
        }

        sb.append(String.valueOf(min));
        sb.append(" ");
        sb.append(String.valueOf(max));

        System.out.println(sb);
    }
}
