class Solution {

    public long gcd(long a,long b){

        if(b==0)return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        

        int n=nums.length;
        long prefix[]=new long[n];
        long maxx=0;
        for(int i=0;i<n;i++){

            maxx=Math.max(maxx,nums[i]);
            prefix[i]=gcd(maxx,nums[i]);
        }
        
        Arrays.sort(prefix);
        long tot=0;
        for(int i=0;i<n/2;i++){
            tot+=gcd(prefix[i],prefix[n-i-1]);
        }
        return tot;

    }
}