package BaekjoonAlone;

import java.io.*;
import java.util.*;

public class 나머지 {
    public static void main(String[] args) throws IOException{
        /* ver 1
        Scanner sc = new Scanner(System.in);
        double A = sc.nextdouble();
        double B = sc.nextdouble();
        double C = sc.nextdouble();

        double sumAdd1 = (A + B) % C;
        double sumAdd2 = ((A % C) + (B % C)) % C;
        double sumMul1 = (A * B) % C;
        double sumMul2 = ((A % C) * (B % C)) % C;
         */

        // ver 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 알파벳 수가 늘어나서 반복문을 사용해야되면 배열을 사용
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());;
        double C = Integer.parseInt(st.nextToken());;

        double sumAdd1 = (A + B) % C;
        double sumAdd2 = ((A % C) + (B % C)) % C;
        double sumMul1 = (A * B) % C;
        double sumMul2 = ((A % C) * (B % C)) % C;

        System.out.println(sumAdd1);
        System.out.println(sumAdd2);
        System.out.println(sumMul1);
        System.out.println(sumMul2);
    }
}
