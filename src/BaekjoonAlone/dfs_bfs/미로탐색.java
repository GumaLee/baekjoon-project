package BaekjoonAlone.dfs_bfs;

import BaekjoonAlone.단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static class Node {
        int x;
        int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] dir = {{0,1}, {1,0}, {-1,0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        int[] mapSize = MapSizeInput();
        int row = mapSize[0];
        int column = mapSize[1];

        int[][] map = makeMap(row, column);

        showMap(map, row, column);
        System.out.println();
        System.out.println(row + " " + column);

//        findWay(map);
    }

    private static int[] MapSizeInput() throws IOException{
        StringTokenizer coordinateToken;
        coordinateToken = new StringTokenizer(bufferedReader.readLine());

        int row = Integer.parseInt(coordinateToken.nextToken());
        int colum = Integer.parseInt(coordinateToken.nextToken());
        int[] mapSize = new int[2];

        mapSize[0] = row;
        mapSize[1] = colum;

        return mapSize;
    }

    private static int[][] makeMap(int row, int column) throws IOException{
        int[][] map = new int[row][column];

        for(int i = 0; i < row; i++) {
            String inputLine = bufferedReader.readLine();

            for (int j = 0; j < column; j++)
                map[i][j] = Integer.parseInt(String.valueOf(inputLine.charAt(j)-'0'));
        }

        return map;
    }

    private static void showMap(int[][] map, int row, int column) {
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }

    private static int[][] findWay(int[][] map) {
        int[][] tempMap = map.clone();
        int row = map.length;
        int column = map[0].length;

        Node targetNode = new Node(row, column);

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Queue<Node> nodeQueue = new LinkedList<>();
                nodeQueue.add(new Node(0, 0));
                tempMap[i][j] = 0;

                while(!nodeQueue.isEmpty()) {
                    Node node = nodeQueue.poll();
                    if(node.x == targetNode.x && node.x == )
                    for(int d = 0; d < 4; d++) {
                        int dx = node.x + dir[d][0]; // 상, 하
                        int dy = node.y + dir[d][1]; // 좌, 우

                        if(dx >= 0 && dy >=0 && dx < row && dy < column && tempMap[dx][dy] == 1) {
                            tempMap[dx][dy] = 0;
                            nodeQueue.add(new Node(dx, dy));
                        }
                    }
                }
            }
        }

    }
}
