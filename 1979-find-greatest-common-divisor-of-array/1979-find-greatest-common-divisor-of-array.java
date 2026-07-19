class Solution {
    public int gcd(int a,int b){
        
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        for(int a:nums){
            
            minn=Math.min(minn,a);
            maxx=Math.max(maxx,a);
        }
        return gcd(minn,maxx);

    }
}