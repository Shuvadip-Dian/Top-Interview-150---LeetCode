class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}

// class Solution {
//     public void rotate(int[][] M) {
//         int n = M.length, depth = n / 2;
//         for (int i = 0; i < depth; i++) {
//             int len = n - 2 * i - 1, opp = n - 1 - i;
//             for (int j = 0; j < len; j++) {
//                 int temp = M[i][i+j];
//                 M[i][i+j] = M[opp-j][i];
//                 M[opp-j][i] = M[opp][opp-j];
//                 M[opp][opp-j] = M[i+j][opp];
//                 M[i+j][opp] = temp;
//             }
//         }
//     }
// }