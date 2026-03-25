class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int  n=grid.length;
        int m=grid[0].length;

        long tot=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                tot+=grid[i][j];
            }
        }

        if(tot%2!=0) return false;
        long half=tot/2;

            long sum=0;
        for(int i=0;i<n;i++){
            int row=0;
            for(int j=0;j<m;j++){
                row+=grid[i][j];
            }
            sum+=row;
            if(sum==half) return  true;

        }
        sum=0;

        for(int j=0;j<m;j++){
            int col=0;
            for(int i=0;i<n;i++){
                col+=grid[i][j];

            }
            sum+=col;
            if(half==sum) return true;
        }

        return false;
    }
}