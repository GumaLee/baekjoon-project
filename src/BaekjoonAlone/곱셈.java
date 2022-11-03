package BaekjoonAlone;

import java.io.*;

public class 곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());

        int C = A * (B % 10);
        int D = A * ((B % 100)/10);
        int E = A * (B / 100);
        int F = C + 10*D + 100*E;

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
