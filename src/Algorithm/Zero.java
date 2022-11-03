package Algorithm;
import java.util.*;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int num;

        for(int i = 0; i < K; i++) {
            num = sc.nextInt();
            if(!stack.isEmpty()){
                if(num > 0 && num <= 100000)
                    stack.push(num);
                else if(num == 0)
                    stack.pop();
            }
            else {
                if(num > 0 && num <= 100000)
                    stack.push(num);
                else if(num == 0)
                    System.out.println("지울 수가 없습니다.");
            }
        }

        double sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
