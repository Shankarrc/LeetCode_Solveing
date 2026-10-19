class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>shan=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            if(nums[i]==target){
                shan.add(i);
            }
        }
        return shan;
    }
}