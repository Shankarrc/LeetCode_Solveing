class Solution {
    public int maxProduct(int[] nums) {
        

        int pre=1;
        int suf=1;
        int maxx=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){

            if(pre==0) pre=1;
            if(suf==0) suf=1;

            pre=pre*nums[i];
            suf=suf*nums[n-i-1];
            maxx=Math.max(maxx,Math.max(pre,suf));
        }
        return maxx;
    }
}