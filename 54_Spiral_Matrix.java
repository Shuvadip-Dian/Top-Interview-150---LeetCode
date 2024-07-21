import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length == 0) return res;
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        return res;
    }
}

// class Solution{
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> result = new LinkedList<Integer>();
//         if(matrix == null || matrix.length == 0) return result;
//         int startRow = 0, endRow = matrix.length-1;
//         int startCol = 0, endCol = matrix[0].length - 1;
//         int dir = 0;
//         while(startRow <= endRow && startCol <= endCol) {
//             switch(dir) {
//                 case 0: //RIGHT
//                     for(int col = startCol; col <= endCol; col++)
//                         result.add(matrix[startRow][col]);
//                     startRow++;
//                     break;
//                 case 1: //DOWN
//                     for(int row = startRow; row <=endRow; row++) 
//                         result.add(matrix[row][endCol])    ;
//                     endCol--;
//                     break;
//                 case 2://LEFT
//                     for(int col = endCol; col >= startCol; col --) 
//                         result.add(matrix[endRow][col]);
//                     endRow--;
//                     break;
//                 case 3://UP
//                     for(int row = endRow; row >= startRow; row--)
//                         result.add(matrix[row][startCol]);
//                     startCol++;  
//                     break;
//             }                                   
//             dir = (dir+1)%4;                                                            
//         }
//         return result;
//     }
// }