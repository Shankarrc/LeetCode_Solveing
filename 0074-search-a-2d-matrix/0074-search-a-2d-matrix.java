class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
       int m=matrix[0].length,l=0;
       int r=n*m -1;
       
       while(l<=r)
       {
        int mid=(r+l)/2;
        int i=mid/m;
        int j=mid%m;
        if( matrix[i][j] == target)
        {
            return true;
        }
        else if(target< matrix[i][j] )
        {
            r=mid-1;
        }
        else
        {
            l=mid+1;
        }
       }
       return false;
    }
}