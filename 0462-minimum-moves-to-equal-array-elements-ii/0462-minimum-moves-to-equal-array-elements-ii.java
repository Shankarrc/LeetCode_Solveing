class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];

        int  move=0;
        for(int a:nums){

            move+=Math.abs(a-mid);
        }
        return move;
    }
}