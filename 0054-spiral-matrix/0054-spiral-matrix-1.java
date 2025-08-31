class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // def of startrow (sr), endrow (er), startcolumn (sc), endcolumn (ec):
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        // init result array:
        List<Integer> res = new ArrayList<>();

        // iteration to get the full array
        while (sr <= er && sc <= ec) {

            // stage 1
            for (int j = sc; j <= ec; j++) {
                res.add(matrix[sr][j]);
            }

            // stage 2
            for (int i = sr + 1; i <= er; i++) {
                res.add(matrix[i][ec]);
            }

            // stage 3
            if (er > sr) {
                for (int j = ec -1; j >= sc; j--) {
                    res.add(matrix[er][j]);
                }
            }

            // stage 4
            if (ec > sc) {
                for (int i = er - 1; i > sr; i--) {
                    res.add(matrix[i][sc]);
                }
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        return res;

    }
}