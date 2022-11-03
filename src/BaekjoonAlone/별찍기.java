package BaekjoonAlone;
// https://www.acmicpc.net/problem/2438

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 별찍기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int init = 1; // 처음 별의 개수

        StringBuilder sb = new StringBuilder();

            for(int j = 0; j < count; j++) {
                for(int k = 0; k < (count - init); k++)
                    sb.append(" ");
                for(int r = 0; r < init; r++)
                    sb.append("*");

                sb.append("\n");
                init++;
            }
        System.out.println(sb);
    }
}
