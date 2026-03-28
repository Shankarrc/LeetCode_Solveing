class Solution {
    public int check(int nums[],int goal){
        if(goal<0) return 0;
       int sum=0;
        int l=0,r=0;
        int ans=0;
        while(r<nums.length){
            sum+=nums[r];

            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            

            ans+=r-l+1;

            r++;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return check(nums,goal)-check(nums,goal-1);
        
    }
}