public class NKnights {
    public static void main(String[] args) {
        int k = 4;
        boolean[][] board = new boolean[4][4];
        knight(board, 0, 0, k);
    }

    static void knight(boolean[][] board, int row, int col, int k){
        if (k == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, k);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, k-1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, k);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 1, col - 2)) {
         if (board[row - 1][ col - 2]) {
             return false;
            }
        }
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean elem : row) {
                if(elem) {
                    System.out.print("K ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
