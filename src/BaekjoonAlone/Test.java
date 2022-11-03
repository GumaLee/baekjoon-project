package BaekjoonAlone;

public class Test {
    // 한수
    int hanSoo(int n) {

        if(n < 1 && n >= 1000) {
            System.out.println("범위를 초과합니다. 프로그램 종료");
            System.exit(0);
        }

        int count = 0;
        int a, b, c;

        if(n < 100)
            count = n;

        else {
            count = 99;

            for(int i = 100; i <= n; i++) {
                a = i / 100;
                b = (i % 100) / 10;
                c = i % 10;

                if((b >= c) && (a >= b)) {
                    if((a-b) == (b-c))
                        count++;
                }
                else if((b >= a) && (c >= b)) {
                    if((c-b) == (b-a))
                        count++;
                }
            }
        }

        return count;
    }
}


