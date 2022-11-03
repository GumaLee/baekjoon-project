package Algorithm;

import java.util.*;

public class multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int D = A * B * C;
        String result = Integer.toString(D);
        char[] array = result.toCharArray();

        int[] arr = new int[10];


        for (int i = 0; i < array.length; i++) {
            int num1  = array[i] - 48;
            arr[num1]++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
