class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long>res=new ArrayList<>();
        for(int a:nums){
            res.add((long)a);
        }
        int i=0;
        while(i<res.size()-1){

            if(res.get(i).equals(res.get(i+1))){
                long ans=res.get(i)+res.get(i+1);
                res.set(i,ans);
                res.remove(i+1);
                if(i>0)i--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}