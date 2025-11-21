public class FloydWarshall {
    public void shortest_distance(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = (int)1e9;
                }
                if (i == j) matrix[i][j] = 0;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }
// Space - O(n^2) : Although the matrix is given but since we are performing operations on it therefore it will be put into the space we are using; & Time - O(n^3)
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] < 0) {
                System.out.println("Negative cycle");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == (int)1e9) {
                    matrix[i][j] = -1;
                }
            }
        }
    }
}
