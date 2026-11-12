class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int s=1,l=1;
       int maxl=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                l+=1;
                s=1;
            }
            else if(nums[i]<nums[i-1])
            {
                s+=1;
                l=1;
            }
            else
            {
                s=1;
                l=1;
            }
            maxl=Math.max(maxl,Math.max(l,s));
        }

        return maxl;
    }
}