package BaekjoonAlone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 바이러스_BFS {
    static List<Integer>[] list;
    static boolean[] visited;
    static int N;
    static int M;
    static int V;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        V = 1;

        // 연결관계 리스트 생성
        list = new List[N];
        for(int i = 0; i < N; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            token = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(token.nextToken()) - 1;
            int node2 = Integer.parseInt(token.nextToken()) - 1;
            list[node1].add(node2);
            list[node2].add(node1);
        }
        for(int i = 0; i < N; i++) {
            Collections.sort(list[i]);
        }

        visited = new boolean[N];

        bfs();
        System.out.println(sb);
    }

    static void bfs() {
        Queue<Integer> que = new LinkedList<>();
        que.add(V-1);
        visited[V-1] = true;

        int cnt = 0;
        while(!que.isEmpty()) {
            int num = que.poll();
            // sb.append(num+1).append(" "); // 원래 들어가 있던 수는 정점-1 값이므로
            for(int nums : list[num]) {
                if(!visited[nums]) {
                    visited[nums] = true;
                    que.add(nums);
                    cnt++;
                }
            }
        }
        sb.append(cnt);
    }
}
