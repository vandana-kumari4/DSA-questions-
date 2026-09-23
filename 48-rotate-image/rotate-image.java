class Solution {

    public void rotate(int[][] matrix) {

int N = matrix.length;

     for(int row = 0; row<N;row ++){
    for(int col= row +1;col<N;col++){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp ;
    }
     }
    for(int row= 0; row <N ;row ++){
         int startcol =0;
         int endcol = N-1;
         while(startcol <= endcol){
            int temp = matrix[row][startcol];
            matrix[row][startcol] = matrix[row][endcol];
          matrix[row][endcol] = temp;

          startcol++;
          endcol --;
         }
    }
    }
}

  