class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<int[]>q=new LinkedList<>();
        int fre=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(grid[i][j]==2){
                    q.offer(new int []{i,j});
                }
                else if(grid[i][j]==1){
                    fre++;
                }
            }
        }
        if(fre==0) return 0;
        int minn=0;
        int[][]direction={{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int sz=q.size();
            boolean rotted=false;

            for(int i=0;i<sz;i++){
            int []curr=q.poll();

            for(int[] dir:direction){

                int r=dir[0]+curr[0];
                int c=dir[1]+curr[1];

                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
                        grid[r][c]=2;
                        q.offer(new int[]{r,c});
                        rotted =true;
                         fre--;
                }
            }
            }
                 if(rotted)minn++;
        }
        return (fre==0)?minn:-1;
    }
}