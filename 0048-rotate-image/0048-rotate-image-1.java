class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        for (int top = 0, bottom = m; bottom > top; top++, bottom--) {
            for (int j = 0; j <= n; j++) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
            }
        }

        for (int i = 0; i <= m; i++) {
            for (int j = i + 1; j <= n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}