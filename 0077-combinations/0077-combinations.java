class Solution {
    public List<List<Integer>> fun(int i,int n,int k,List<Integer>ans){
        List<List<Integer>>res=new ArrayList<>();

        if(k==ans.size()){
            res.add(new ArrayList<>(ans));
            return res;
        }

        if(i>n){
            return res;
        }

        ans.add(i);
        res.addAll(fun(i+1,n,k,ans));
        ans.remove(ans.size()-1);
        res.addAll(fun(i+1,n,k,ans));
        return res;
    }
    public List<List<Integer>> combine(int n, int k) {
        
        return fun(1,n,k,new ArrayList<>());
    }
}