class Solution {
    public boolean winnerSquareGame(int n) {
    
    boolean []dp=new boolean[n+1];
    for(int i=0;i<=n;i++){
        if(!dp[i]){
                for(int j=1;j*j+i<=n;j++){
                    dp[j*j+i]=true;
        }
        }
        if(dp[n]) return true;        
    }
    return false;
    }
}