public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
// yow can use any of the two methods shown upside and downside for diagonal elements.
        r = row;
        c = col;
        for (int k = 0; ; k++) {
            --r;
            ++c;
            if (r < 0 || c > board.length-1) {
                break;
            } else {
                if (board[r][c]) {
                    return false;
                }
            }
        }
// or
//        int maxLeft = Math.min(row, col);
//        for (int i = 1; i <= maxLeft; i++) {
//            if (board[row-i][col-i]) {
//                return false;
//            }
//        }
//        int maxRight = Math.min(row, board.length - 1 - col);
//        for (int i = 1; i <= maxRight; i++) {
//            if (board[row-i][col+i]) {
//                return false;
//            }
//        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean elem : row) {
                if(elem) {
                    System.out.print("Q ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
