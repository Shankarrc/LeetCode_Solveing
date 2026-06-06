class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        
        int l=0;
        int r=0;
        for(int i=0;i<n;i++){
            left[i]=l;
            l+=nums[i];
            right[n-1-i]=r;
            r+=nums[n-1-i];
        }
        
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}