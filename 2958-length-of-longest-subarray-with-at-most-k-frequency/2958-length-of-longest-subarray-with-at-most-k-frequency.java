class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>shan=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int r=0;r<nums.length;r++){
                int curr=nums[r];
            shan.put(curr,shan.getOrDefault(curr,0)+1);

            while(shan.get(curr)>k){
                int leftval=nums[left];
                shan.put(leftval,shan.get(leftval)-1);
            left++;
            }
            maxlen=Math.max(maxlen,(r-left+1));
        }
        return maxlen;
    }
}