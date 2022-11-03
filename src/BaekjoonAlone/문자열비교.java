package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열비교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        String original = "joonas";

        // sb는 String이 아니기 때문에 그냥 equals()로는 비교가 안되고 toString()으로 바꿔주고
        // 비교해야된다.
        if(sb.toString().equals(original))
            sb.append("??!");

        System.out.println(sb);
    }
}
