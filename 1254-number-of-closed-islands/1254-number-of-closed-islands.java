class Solution {
    public void dfs(int [][] grid,int i,int j){

        if(i<0 || j<0 || i>=grid.length ||j>=grid[0].length || grid[i][j]==1){
            return;
        }
        grid[i][j]=1;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
    public int closedIsland(int[][] grid) {
         int row=grid.length;
         int col=grid[0].length;

         for(int i=0;i<row;i++){

            dfs(grid,i,0);
            dfs(grid,i,col-1);
         }
         for(int i=0;i<col;i++){
            dfs(grid,0,i);
            dfs(grid,row-1,i);
         }
         int cnt=0;
         for(int i=1;i<row-1;i++){

            for(int j=1;j<col-1;j++){

                if(grid[i][j]==0){
                    cnt++;
                    dfs(grid,i,j);
                }
            }
         }

         return  cnt;
    
    }
}