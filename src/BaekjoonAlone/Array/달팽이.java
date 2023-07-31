package BaekjoonAlone.Array;

// 1923번
// https://www.acmicpc.net/problem/1913

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bufferedReader.readLine());
        int targetNum = Integer.parseInt(bufferedReader.readLine());

        int[][] snail = makeSnail(size);
        drawSnail(snail);
        getCoordinates(snail, targetNum);
    }

    public static int[][] makeSnail(int size) {

        int[][] map = new int[size][size];

        int value = 1, dirCnt = 1;
        int x = size / 2, y = size / 2;

        while(true) {
            // 위로 이동
            for(int up = 0; up < dirCnt; up++) {
                if(value <= size * size) {
                    map[y--][x] = value++;
                    continue;
                }
                else break;
            }
            if(value > size * size) break;

            // 오른쪽으로 이동
            for(int right = 0; right < dirCnt; right++) {
                map[y][x++] = value++;
            }
            dirCnt++;

            // 아래로 이동
            for(int down = 0; down < dirCnt; down++) {
                if(value <= size * size) {
                    map[y++][x] = value++;
                    continue;
                }
                else break;
            }
            if(value > size * size) break;

            // 왼쪽으로 이동
            for(int left = 0; left < dirCnt; left++) {
                map[y][x--] = value++;
            }
            dirCnt++;
        }

        return map;
    }

    public static void drawSnail(int[][] map) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int y = 0; y < map.length; y++) {
            for(int x = 0; x < map.length; x++) {
                stringBuilder.append(map[y][x] + " ");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }

    public static void getCoordinates(int[][] map, int targetNum) {

        int targetX = 0, targetY = 0;

        for(int y = 0; y < map.length; y++) {
            for(int x = 0; x < map.length; x++) {
                if(map[y][x] == targetNum) {
                    targetX = y + 1;
                    targetY = x + 1;
                    break;
                }
            }
        }

        System.out.println(targetX + " " + targetY);
    }
}
