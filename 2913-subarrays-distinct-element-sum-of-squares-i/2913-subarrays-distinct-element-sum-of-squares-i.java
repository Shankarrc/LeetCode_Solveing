class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int res=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>shan=new HashSet<>();
            for(int j=i;j<n;j++){
                shan.add(nums.get(j));
            res+=shan.size()*shan.size();
            }

        }

    return res;
    }
}