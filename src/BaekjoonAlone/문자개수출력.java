package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자개수출력 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String upperWord = word.toUpperCase();
        StringTokenizer st = new StringTokenizer(upperWord);


        // 알파벳 개수를 저장할 배열
        int alpha[] = new int[26];
        int index = 65;
        String tmp;

        while(st.hasMoreTokens()) {
            tmp = st.nextToken();
            index = tmp.charAt(0);

            if(index >= 65 & index <= 90)
                alpha[index-65]++;
        }

        for(int i = 0 ; i <= 25; i++) {
            System.out.print(alpha[i]);
        }

        int maxIndex = 0;
        int maxVal = 0;
        for(int i = 0 ; i <= 25; i++) {
            if(alpha[i] >= maxIndex) {
                maxVal = alpha[i];
                maxIndex = i;
            }
        }

        int cnt = 0;
        for(int j = 0; j <= 25; j++) {
            if(alpha[j] == maxVal)
                cnt++;
        }

        System.out.println();

        if (cnt > 1)
            System.out.println("?");
        else
            System.out.println((char)(maxIndex+65));
    }
}

