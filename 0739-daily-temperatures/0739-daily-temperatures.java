class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int [temperatures.length];
    


        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<temperatures.length;i++){

            while(!ans.isEmpty()&& temperatures[ans.peek()]<temperatures[i]){
                int  val=ans.pop();
                res[val]=i-val;
            }
            ans.push(i);
        }
        return res;
    }
}