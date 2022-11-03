package BaekjoonAlone;

import java.io.*;
import java.util.*;

// https://jhnyang.tistory.com/398 : Stringtokenizer vs. Split

public class OX {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String ox;
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int score = 0;

        // score 값 : 증가하다가 X 만나면 0
        for(int i = 0; i < N; i++) {
            ox = br.readLine(); // OX 받아옴

            for(int j = 0; j < ox.length(); j++) {
                if(ox.charAt(j) == 'O')
                    ++score;

                else if(ox.charAt(j) == 'X')
                    score = 0;

                sum += score;
            }
            sb.append(sum);
            sb.append("\n");
            sum = 0;
            score = 0;
        }
        System.out.println(sb);
    }
}
