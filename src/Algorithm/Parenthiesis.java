package Algorithm;
import java.util.*;

public class Parenthiesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        Stack<String> stack = new Stack<>();
        String ps;

        loop:for(int i = 0; i < T; i++) {
            // 한 줄씩 입력받는게 아니라 한번에 입력받는거니까 ps랑 문자를 비교하면 안되네
            ps = sc.next();
            // 문자열을 잘라서 하나씩 스택에 넣자
            // 바로 스택에 넣는건 안되는듯 싶다. 배열에 넣고 스택에 넣자.
            // stack.push(ps.split(""))
            String[] str = ps.split("");
            for(int j = 0; j < str.length; j++) {
                if (str[j].equals("("))
                    stack.push(ps);
                else if (str[j].equals(")")) {
                    if (!stack.isEmpty())
                        stack.pop();
                    else {
                        System.out.println("NO");
                        continue loop;
                    }
                }
            }

            if(!stack.isEmpty())
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }
}
