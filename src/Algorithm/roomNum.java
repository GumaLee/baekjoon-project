package Algorithm;
import java.util.*;

public class roomNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 0 < N < 1,000,000

        String result = Integer.toString(N);
        char[] nums = result.toCharArray();
        int[] array1 = new int[10]; // 6, 9를 구분해서 저장하는 배열


        // array1에 필요한 각 수의 개수를 넣어주자
        for (char num : nums) {
            int a = num;
            array1[a-48]++;
        }

        System.out.println(Arrays.toString(array1));

        int six_nine = array1[6] + array1[9];
        six_nine = six_nine % 2 == 0 ? six_nine / 2 : six_nine / 2 + 1;
        //6이랑 9의 개수에 따른 필요한 세트의 개수



        // array2중 가장 큰 요소의 수가 필요한 최소 세트 수이다.
        int setNum = array1[0];
        for(int i = 0; i < array1.length; i++) {
            if(i == 6 || i == 9)
                array1[i] = six_nine;
            setNum = Math.max(setNum, array1[i]);
        }
        System.out.println(setNum);
    }
}
