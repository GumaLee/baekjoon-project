package Algorithm;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class HideSeek {
    public static void main(String[] args) throws IOException{
        // 걷는다 : 1초 후에 +1 or -1
        // 순간이동 : 1초 후에 *2
        // 수빈이(N)와 동생(K)의 위치는 주어진다.
        // 수빈이가 동생을 찾을 수 있는 가장 빠른 시간은 몇 초 후인가?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer((br.readLine()));

        int N = Integer.parseInt(token.nextToken()); // throws IOException을 해줘야한다.
        int K = Integer.parseInt(token.nextToken()); // 여기서 token.nextToken()을 쓰는 이유는?

        // 동생을 찾는데 걸리는 시간이 최소가 되게 하려면 순간이동을 최대한 많이 하면 된다.
        // BFS를 이용할 때
        // 5 -> 10, 4, 6
        // 10으로 갔을 때 -> 20, 11, 9
        // 4로 갔을 때 -> 8, 3, 5(x)
        // 이런 식으로 하면 5 (10 6 4)->이게 첫번째 노드에서 갈 수 잇는 노드/ 써가면서 해보면서 지워나가면서 해
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ... -> 이게 dist[] 배열이다.
        //       1 0 1   2 2  1  2  3  3        3  4     3  2

        // shift f6 -> 이름 한번에 바꾸기

        int[] dist = new int[K * 2 + 1];
        // dist[subin] = 수빈에서 수빈까지 최소시간
        // dist[6] = 수빈에서 6까지 최소 시간
        Arrays.fill(dist, Integer.MAX_VALUE);
        // Arrays.fill(count, Integer.MAX_VALUE); -> 제일 작은 값을 넣어야 되니까 가장 큰 값으로 채워놓자

        Queue<Integer> que = new LinkedList<>();
        que.add(N);
        dist[N] = 0; // 수빈이에서 수빈이까지 최소거리 0으로 지정

        /*
        큐
        Poll : 값을 꺼냄
        Peek : 값을 보여줌
        Push, Add : 값을 넣음
         */

        while(!que.isEmpty()) {  // 끝까지 다 갔을 때까지
            int node = que.poll();
            if(node == K) { // 목적지까지 도착했을 경우 break, 여기선 동생이 있는곳까지 갔을 때 Stop
                break;
            }
            if(node*2 < dist.length && dist[node*2] > dist[node] + 1) { // dist[node * 2] > dist[node] + 1 이 부분은 뭐지
                dist[node * 2] = dist[node] + 1;
                que.add(node*2);
            }
            if(node+1 < dist.length && dist[node+1] > dist[node] + 1) {
                dist[node + 1] = dist[node] + 1;
                que.add(node + 1);
            }
            if(node-1 >= 0 && dist[node-1] > dist[node] + 1) {
                dist[node-1] = dist[node] + 1;
                que.add(node-1);
            }
        }
        System.out.println(dist[K]);
    }
}
