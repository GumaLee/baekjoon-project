package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단지번호붙이기 {

    static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] dir = {{0,1}, {1,0}, {-1,0}, {0, -1}};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        String line;

        // n : 세로
        // m : 가로
        for(int n = 0; n < N; n++) {
            line = br.readLine();
            for(int m = 0; m < N; m++) {
                arr[n][m] = Integer.parseInt(String.valueOf(line.charAt(m)-'0')); // 요오령 아스키코드 0값을 빼면, 바로 숫자를 가져올 수 있다.
//                System.out.print(arr[n][m] + " ");
            }
//            System.out.println();
        }

        List<Integer> result = new ArrayList<>();
        int danNum = 0;
        int aptNum = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(arr[i][j] == 1) {
                    danNum++;
                    aptNum++;
                    Queue<Node> que = new LinkedList<>();
                    que.add(new Node(i,j)); // 생성자로 바로 이렇게 넣어도 되나?
                    arr[i][j] = 0;

                    while(!que.isEmpty()) {
                        Node node = que.poll();
                        for(int d = 0; d < 4; d++) {
                            int dx = node.x + dir[d][0]; // 상, 하
                            int dy = node.y + dir[d][1]; // 좌, 우

                            if(dx >= 0 && dy >=0 && dx < N && dy < N && arr[dx][dy] == 1) {
                                arr[dx][dy] = 0;
                                que.add(new Node(dx, dy));
                                aptNum++;
                            }
                        }
                    }
                    result.add(aptNum);
                }
                aptNum = 0;
            }
        }
        System.out.println(danNum);
        Collections.sort(result);
        for (int i : result)
            System.out.println(i);
    }
}
