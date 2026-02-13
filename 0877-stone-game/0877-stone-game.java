class Solution {
    Integer dp[][];
    public int  rec(int i,int j,int []p){

        if(i>j)return 0;
        if(dp[i][j]!=null)  return dp[i][j];
         int lstone=p[i]-rec(i+1,j,p);
         int rstone=p[j]-rec(i,j-1,p);
        return  dp[i][j]=Math.max(lstone,rstone);
    }
    public boolean stoneGame(int[] piles) {
        
        int n=piles.length;
        dp=new Integer[n][n];
     return rec(0,n-1,piles)>0;
    }
}