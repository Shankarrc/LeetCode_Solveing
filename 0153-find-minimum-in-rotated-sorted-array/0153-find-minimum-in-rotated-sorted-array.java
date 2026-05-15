class Solution {
    public int findMin(int[] nums) {
        

        int low=0;
        int high=nums.length-1;
        int minn=Integer.MAX_VALUE;
        while(low<=high){

            int mid=(high-low)/2+low;

            if(nums[low]<=nums[mid]){
            minn=Math.min(minn,nums[low]);
            low=mid+1;
            }
            else{
                minn=Math.min(minn,nums[mid]);
                high=mid-1;

            }
        }
        return minn;
    }
}