package Algorithm;
import java.util.*;

public class Editor {
    public static void main(String[] args) {
        // 문자열을 받는다.
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        // 스택을 생성한다.
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        // 받은 문자열을 왼쪽 스택에 추가
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            left.push(arr[i]);
        }

        // 입력할 명령어의 개수 입력받기
        int m = scan.nextInt();

        // 명령어 수행
        for(int i = 0; i < m; i++) {
            char tmp;
            StringTokenizer token = new StringTokenizer(scan.nextLine());
            // L
            if(token.nextToken().equals("L") && left.isEmpty() != true) {
                tmp = left.pop();
                right.push(tmp);
            }

            // D
            if(token.nextToken().equals("D") && right.isEmpty() != true) {
                tmp = right.pop();
                left.push(tmp);
            }

            // B
            if(token.nextToken().equals("B") && left.isEmpty() != true) {
                tmp = left.pop();
            }

            // P
            if(token.nextToken().equals("P")) {
                // String을 char로 변환하는 방법
                left.push(token.nextToken().charAt(0));
            }
        }

        // 결과를 보여라
        int leftSize = left.size();
        char[] leftArray1 = new char[leftSize];
        char[] leftArray2 = new char[leftSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray1[i] = left.pop();
        }

        for (int i = 0; i < leftSize; i++) {
            leftArray2[i] = leftArray1[leftSize-1-i];
            System.out.print(leftArray2[i]);
        }

        int rightSize = right.size();
        char[] rightArray = new char[rightSize];

        for (int i = 0; i < rightSize; i++) {
            System.out.print(rightArray[i]);
        }
    }
}
