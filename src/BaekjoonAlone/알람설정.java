package BaekjoonAlone;

import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class 알람설정 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        // 0 <= H <=23, 0 <= M <= 59
        int H = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());
        int result = M - 45;
        int H2 = H - 1;
        int M2 = 60 + result;

        if(result >= 0)
            System.out.println(H + " " + result);
        else {
            if(H > 0 && H <= 23)
                System.out.println(H2 + " " + M2);
            else if(H == 0)
                System.out.println("23 " + M2);
        }
    }
}
