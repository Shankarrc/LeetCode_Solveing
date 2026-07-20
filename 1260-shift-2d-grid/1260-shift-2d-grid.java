class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int tot=n*m;
        k=k%tot;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i+=1){
            ans.add(new ArrayList<>());
            for(int j=0;j<m;j+=1){
                ans.get(i).add(0);
            }
        }
         for(int i=0;i<n;i+=1){
            
            for(int j=0;j<m;j+=1){

                int curr=i*m+j;
                int next=(curr+k)%tot;
                int nextrow=next/m;
                int nextcol=next%m;
                ans.get(nextrow).set(nextcol,grid[i][j]);
            }
        }
        return ans;


    }
        
    }
