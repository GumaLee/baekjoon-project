package Algorithm;
import java.util.*;

public class KeyLoger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        for(int i = 0; i < L ; i++) {
            String init_str = scan.next();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();
            /*
               < : 왼쪽 이동
               > : 오른쪽 이동
               - : 벡스페이스
             */
            for(char c : init_str.toCharArray()) {
                switch (c) {
                    case '<':
                        if(!left.isEmpty())
                            right.push(left.pop()); // 왼쪽에서 꺼낸거 오른쪽으로
                        break;
                    case '>':
                        if(!right.isEmpty())
                            left.push(right.pop());
                        break;
                    case '-':
                        left.pop();
                        break;
                    default:
                        left.push(c);
                        break;
                }
            }
            // left stack 에서 꺼낸 값들은 거꾸로 출력
            String answer = "";
            StringBuilder sb = new StringBuilder();
            init_str = "";
            while(!left.isEmpty()) {
                init_str += left.peek();
                sb.append(left.pop());
            }
            sb.reverse();
            while(!right.isEmpty()) {
                sb.append(right.pop());
            }
            System.out.println(sb.toString());
        }
    }
}
