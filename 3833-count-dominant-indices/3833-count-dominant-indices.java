class Solution {
    public int dominantIndices(int[] nums) {
        int cnt=0;
       
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int avg=0;
            for(int j=i+1;j<n;j++){
                avg+=nums[j];
            }
            avg=avg/(n-i-1);
            if(nums[i]>avg)cnt++;
            
        }
        return cnt;
        
    }
}