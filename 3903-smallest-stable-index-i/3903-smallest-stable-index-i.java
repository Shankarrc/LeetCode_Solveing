class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){

            int maxval=nums[i];
            int minval=nums[i];
            for(int j=0;j<i;j++){
                maxval=Math.max(maxval,nums[j]);
            }
            for(int j=i+1;j<n;j++){
                minval=Math.min(minval,nums[j]);
            }

            if(maxval-minval<=k){
                return i;
            }
        }
        return -1;
    }
}