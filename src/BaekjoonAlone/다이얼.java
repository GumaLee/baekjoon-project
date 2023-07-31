package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        String word = br.readLine();
        char[] wordArr = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordArr[i] = word.charAt(i);
        }

        for (char c : wordArr) {
            int tmp = c - '0';
            if (tmp >= 65 && tmp <= 67)
                sum = sum + 3;
            else if (tmp >= 68 && tmp <= 70)
                sum += 4;
            else if (tmp >= 71 && tmp <= 73)
                sum += 5;
            else if (tmp >= 74 && tmp <= 76)
                sum += 6;
            else if (tmp >= 77 && tmp <= 79)
                sum += 7;
            else if (tmp >= 80 && tmp <= 83)
                sum += 8;
            else if (tmp >= 84 && tmp <= 86)
                sum += 9;
            else if (tmp >= 87 && tmp <= 90)
                sum += 10;
        }

        System.out.println(sum);
    }
}
