class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int j=matrix[0].length-1;
       for(int i=0;i<matrix.length;i++){
        int low=0;
        int high=j;
        if(matrix[i][0]<=target && target<=matrix[i][j]){
        while(low<=high){

            int mid=(low+high)/2;
            if(matrix[i][mid]==target){
                return true;
            }
            else if(matrix[i][mid]>target){
                
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }

        }
       } 
        return false;
    }
}