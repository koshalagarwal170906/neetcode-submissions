class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int n = row * column;
        int start =0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int rowIndex = mid/column;
            int colIndex = mid%column;
            if(matrix[rowIndex][colIndex]==target){
                return true;
            }
            else if(matrix[rowIndex][colIndex]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;

    }
}
