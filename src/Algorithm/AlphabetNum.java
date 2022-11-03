package Algorithm;
import java.util.Scanner;

public class AlphabetNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        str = scan.nextLine();

        char[] array = str.toCharArray();

        int[] alphabet = new int[26];

        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            int num2 = num - 97;
            alphabet[num2]++;
        }

        for(int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
