package Algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort_2750 {
    public static void bubbleSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (j + 1 < length && arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
//            // 과정 출력
//            System.out.print(i + "번쨰 과정 ");
//            for(int x : arr)
//                System.out.print(x+" ");
//            System.out.println();
        }
    }

    public static void selectionSort(int[] arr) {
        final int length = arr.length;

        for(int i = 0; i < length; i++) {
            int minIndex = i;

            for(int j = i+1; j < length; j++) {
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }

            if(minIndex != i) {
                arr[minIndex] = arr[minIndex] + arr[i];
                arr[i] = arr[minIndex] - arr[i];
                arr[minIndex] = arr[minIndex] - arr[i];
            }

            System.out.print(i + "번쨰 과정 ");
            for(int x : arr)
                System.out.print(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        selectionSort(arr);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
