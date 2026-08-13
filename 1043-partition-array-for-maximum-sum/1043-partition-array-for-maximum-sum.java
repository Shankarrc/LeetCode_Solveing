class Solution {
    int K;
    int dp[];
    int fun(int index,int arr[],int n){

        if(n==index) return 0;

        if(dp[index]!=-1) return dp[index];
        int len=0;
        int res=Integer.MIN_VALUE;
        int maxx=Integer.MIN_VALUE;
        for(int i=index;i<Math.min(n,(index+K));i++){
            len++;
            maxx=Math.max(maxx,arr[i]);
            int sum = (len*maxx)+fun(i+1,arr,n);
            res=Math.max(res,sum);
        }
        return dp[index]=res;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.K=k;
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);




        return fun(0,arr,n);


    }
}