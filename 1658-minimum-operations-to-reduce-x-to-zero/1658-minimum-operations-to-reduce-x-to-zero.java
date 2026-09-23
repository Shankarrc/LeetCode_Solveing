class Solution {
    public int minOperations(int[] nums, int x) {
        
        int summ=0;
        for(int i=0;i<nums.length;i++){
            summ+=nums[i];
        }
        int tar=summ-x;
        if(tar<0)return -1;
        int n=nums.length-1;
        

        int left=0;
        int right=0;
        int maxlen=-1;
        int sum=0;
        while(right<=n){
            sum+=nums[right];

            while(left<=right && sum>tar){
                sum-=nums[left];
                left++;
            }
            if(sum==tar && maxlen <(right-left+1)){
                
                maxlen=(right-left+1);
                
            }
            right++;

             
        }
        return maxlen==-1?-1:n+1-maxlen;
    }
}