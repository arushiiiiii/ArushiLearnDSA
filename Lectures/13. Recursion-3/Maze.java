import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3);
        System.out.println(pathRetDiagonal("", 3, 3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathRestrictions("", board, 0, 0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = count(r, c-1);
        int down = count(r-1 , c);
        int ans = right + down;
        return ans;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return ;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static List<String> pathRet(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static List<String> pathRetDiagonal(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }

        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c));
        }
        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + "Dia", r - 1, c - 1));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'R', r, c - 1));
        }
        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}