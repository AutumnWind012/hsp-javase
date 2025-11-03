package com.hspedu;

import java.util.Random;

public class RecursionExercise03 {
    public static void main(String[] args) {

//        Maze maze = new Maze(10, 10);

        Maze maze = new Maze(8, 7, true);

        maze.printMaze();

        System.out.println("开始找路");

        boolean way = maze.findWay(1, 1);

        maze.printMaze();

        if (way) {
            System.out.println("到达终点");
        } else {
            System.out.println("没有到达终点");
        }

    }
}

class Maze {

    static int[][] maze;

    public Maze(int m, int n) {
        maze = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m-1 || j == 0 || j == n-1) maze[i][j] = 1;
                else maze[i][j] = 0;
            }
        }
        maze[3][1] = 1;
        maze[3][2] = 1;
        maze[2][2] = 1;
    }

    public Maze(int m, int n, boolean auto) {
        if (m < 3 || n < 3) {
            throw new IllegalArgumentException("Maze dimensions must be at least 3x3");
        }

        maze = new int[m][n];
        buildMaze(m, n);
    }

    // Build the maze
    private void buildMaze(int m, int n) {
        Random rand = new Random();
        // Step 1: Set borders to 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    maze[i][j] = 1;
                } else {
                    // Step 2: Fill inner area with random 0 (path) or 1 (block)
                    maze[i][j] = rand.nextDouble() < 0.3 ? 1 : 0; // 30% chance of being a wall
                }
            }
        }
        // Step 3: Optional - ensure start and end points are paths
        maze[1][1] = 0;                  // Start
        maze[m - 2][n - 2] = 0;          // End
    }

    public void printMaze() {
        for (int[] ints : maze) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public boolean findWay(int m, int n) {
        // 终止条件
        if (maze[6][5] == 2) return true;
        if (maze[m][n] == 0) {
            // 标记走过的路
            maze[m][n] = 2;
            // 下右左上寻路
            if (findWay(m+1, n)) return true;
            if (findWay(m, n+1)) return true;
            if (findWay(m, n-1)) return true;
            if (findWay(m-1, n)) return true;
            // 四个方向都走不了，标记死路
            maze[m][n] = 3;
        }
        // 继续按照策略寻路
        return false;
    }

}
