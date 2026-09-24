class Solution {
    public int longestSubarray(int[] nums) {
        
        int left=0;
        int right=0;
        int n=nums.length;
        int zero=0;
        int maxlen=0;
        while(right<n){

            if(nums[right]==0){
                zero++;
            }
             

                while( zero>1  ){

                    if(nums[left]==0)zero--;
                    left++;
                }
            maxlen=Math.max(maxlen,right-left);

            right++;
        }
        return maxlen;
    }
}