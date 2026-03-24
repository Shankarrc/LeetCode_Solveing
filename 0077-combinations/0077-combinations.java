class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    
    public void fun(int i,int n,int k,List<Integer>shan)

    {
        if(k==shan.size()){
            ans.add(new ArrayList<>(shan));
             
            return;
        }
        if(i>n)
        {
            return ;
        }
        shan.add(i);
        fun(i+1,n,k,shan);
        shan.remove(shan.size()-1);
        fun(i+1,n,k,shan);
    }
    public List<List<Integer>> combine(int n, int k) {
       List<Integer> shan = new ArrayList<>();
        fun(1,n,k,  shan);
        return ans;
    }
}