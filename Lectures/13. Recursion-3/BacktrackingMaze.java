import java.util.Arrays;

public class BacktrackingMaze {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
//        path("", board, 0, 0);

        pathPrint("", board, 0, 0, new int[board.length][board.length], 1);
    }

    static void path(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // when considering the block in path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            path(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            path(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            path(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            path(p + 'L', maze, r, c - 1);
        }

        // before the function gets removed, also remove the changes made by that function
        maze[r][c] = true;
    }

    static void pathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // when considering the block in pathPrint
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            pathPrint(p + 'D', maze, r + 1, c, path, step+1);
        }
        if (c < maze[0].length - 1) {
            pathPrint(p + 'R', maze, r, c + 1, path, step+1);
        }
        if (r > 0) {
            pathPrint(p + 'U', maze, r - 1, c, path, step+1);
        }
        if (c > 0) {
            pathPrint(p + 'L', maze, r, c - 1, path, step+1);
        }

        // before the function gets removed, also remove the changes made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}

