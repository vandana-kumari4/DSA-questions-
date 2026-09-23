class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
List<Integer> result = new ArrayList<>();
        int startingRow = 0;
        int endingRow = m-1;
         int startingCol = 0;
         int endingCol = n-1;

while(startingRow  <= endingRow && startingCol <= endingCol){
    //row waise left to right
    for(int col = startingCol ; col <= endingCol ;col++){
        result.add(matrix[startingRow][col]);
    }
    startingRow++;
    //col  - top to bottom
for( int row = startingRow ; row <= endingRow ;row ++){
result.add(matrix[row][endingCol]);

}
endingCol --;
if(startingRow <= endingRow){
    for(int col = endingCol; col>= startingCol;col--){
        result.add(matrix[endingRow][col]);
    }
    endingRow--;
}
//sating col top -bottom
if(startingCol <= endingCol){
for(int row = endingRow; row >=  startingRow ; row --){
    result.add(matrix[row][startingCol]);
}
startingCol++;
}
}
return result;

    }
}