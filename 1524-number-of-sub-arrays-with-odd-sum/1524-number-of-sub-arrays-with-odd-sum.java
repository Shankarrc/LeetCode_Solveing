class Solution {
    public int numOfSubarrays(int[] arr) {
        long res=0;
        int sum=0;
        int odd=0;
        int even=1;
        int MOD=1_000_000_007;
        for(int a:arr){

            sum+=a;
            if(sum%2!=0){
                res+=even;
                odd++;
            }
            else{
                res+=odd;
                even++;
            }
        }
        return (int)(res%MOD);
    }
}