class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int low=0,high=m-1;
        int maxrow=0;
        while(low<=high){

            int mid=(low+high)/2;
        
        for(int i=0;i<n;i++){

            if(mat[i][mid]>mat[maxrow][mid]){
                maxrow=i;
            }

        }

        int left=(mid-1==-1)?-1:mat[maxrow][mid-1];
        int right=(mid+1>=m)?-1:mat[maxrow][mid+1];

        if(mat[maxrow][mid]>left && mat[maxrow][mid]>right){
            return new int[]{maxrow,mid};
        }
        else if(left>mat[maxrow][mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
            
        }
        return new int[]{-1,-1};
    }
}