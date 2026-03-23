class Solution {
    public boolean check(int mid,int tar,int nums[] ){
         int sum=0;
         for(int i=0;i<mid;i++){
            sum+=nums[i];
         }
         if(sum>=tar) return true;
         for(int i=mid;i<nums.length;i++){
            sum+=nums[i]-nums[i-mid];
            if(sum>=tar) return true;
         }
         return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int low=1;
        int high=nums.length;
        int ans=0;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(check(mid,target,nums)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
        return ans;
    }
}
