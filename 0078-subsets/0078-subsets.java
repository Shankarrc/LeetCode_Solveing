class Solution {
    public List<List<Integer>> fun(int i,ArrayList<Integer> shan,int nums[]){
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length==i){
            res.add(new ArrayList<>(shan));
            return res;
        }
        shan.add(nums[i]);
        res.addAll(fun(i+1,shan,nums));
        shan.remove(shan.size()-1);
        
        res.addAll(fun(i+1,shan,nums));
        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        return fun(0,new ArrayList<>(),nums);
    }
}