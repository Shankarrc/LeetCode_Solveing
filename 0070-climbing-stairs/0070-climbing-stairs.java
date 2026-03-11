class Solution {
    int dp[]=new int[50];
    
public int rec(int i,int n){
    if(i==n)return 1;
        if(i>n) return 0;
        if(dp[i]!=-1)return dp[i];
        int ans=0;
        ans+=rec(i+1,n);
        ans+=rec(i+2,n);
        return dp[i]=ans;

}
    public int climbStairs(int n) {
        
        Arrays.fill(dp,-1);
       return rec(0,n);
    }
}