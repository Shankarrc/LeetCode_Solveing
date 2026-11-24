class Solution {
    public int maxLength(int[] nums) {
        int  n=nums.length;

        int ans=0;
        for(int i=0;i<n;i++){
            long prod=1;
            long l=1;
            long  g=0;
            for(int j=i;j<n;j++){
                prod *=nums[j];
                l= l/gcd(l,nums[j])*nums[j];
                g=gcd(g,nums[j]);
                if(prod==l*g){
                    ans=Math.max(ans,j-i+1);
                }
                if(prod>1_000_000_000L){
                    break;
                }
            }
        }
        return ans;
    }
    long gcd(long a,long b){
        return  b==0?a:gcd(b,a%b);
    }
}