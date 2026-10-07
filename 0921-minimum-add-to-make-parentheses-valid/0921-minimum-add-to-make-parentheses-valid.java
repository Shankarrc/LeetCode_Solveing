class Solution {
    public int minAddToMakeValid(String s) {
        
        int open=0;
        int ans=0;

        for(char a:s.toCharArray()){

            if(a=='('){
                open++;
            }
            else{

                if(open>0){
                    open--;
                }
                else{
                    ans++;
                }
            }
        }
        if(open>0)ans+=open;
        return ans;
    }
}