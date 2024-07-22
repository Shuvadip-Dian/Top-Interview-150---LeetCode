//Approach-3: Optiamal
class Solution{
    public void setZeroes(int[][] matrix){
		int m=matrix.length, n=matrix[0].length;
        boolean isRow0=false, isCol0=false;        
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0)
                isRow0=true;
        }        
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0)
                isCol0=true;
        }       
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }       
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }        
        if(isRow0){
            for(int j=0;j<n;j++)
                matrix[0][j]=0;
        }        
        if(isCol0){
            for(int i=0;i<m;i++)
                matrix[i][0]=0;
        }
    }
}


//Approach-1: Brute force
// class Solution {
//     public void setZeroes(int[][] matrix){
// 		int m= matrix.length, n= matrix[0].length;
//         int matrix2[][]= new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++)
//                 matrix2[i][j]=matrix[i][j];
//         }       
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     for(int k=0;k<n;k++)
//                         matrix2[i][k]=0;
//                     for(int k=0;k<m;k++)
//                         matrix2[k][j]=0;
//                 }
//             }
//         }    
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++)
//                 matrix[i][j]=matrix2[i][j];
//         }
//     }
// }

//Approach-2: Better
// class Solution{
//     public void setZeroes(int[][] matrix){
// 		int m=matrix.length, n=matrix[0].length;
//         int rowsArray[]= new int[m];
//         int colsArray[]= new int[n];       
//         Arrays.fill(rowsArray,1);
//         Arrays.fill(colsArray,1);        
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     rowsArray[i]=0;
//                     colsArray[j]=0;
//                 }
//             }
//         }       
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(rowsArray[i]==0 || colsArray[j]==0)
//                     matrix[i][j]=0;
//             }
//         }
//     }
// }


//Approach-4: HashSet
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         Set<Integer> row = new HashSet<>();
//         Set<Integer> col = new HashSet<>();
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = 0; j < matrix[0].length; j++){
//                 if(matrix[i][j] == 0){
//                     row.add(i);
//                     col.add(j);
//                 }
//             }
//         }
//         for(int r : row){
//             for(int i = 0; i < matrix[0].length; i++){
//                 matrix[r][i] = 0;
//             }
//         }
//         for(int c : col){
//             for(int i = 0; i < matrix.length; i++){
//                 matrix[i][c] = 0;
//             }
//         }
//     }
// }