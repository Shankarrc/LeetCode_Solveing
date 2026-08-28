class Solution {
    public int minimumMoves(String s) {
        
        int i=0;
        int ans=0;

        while(i<s.length()){

            if(s.charAt(i)=='X'){
                i=i+3;
                ans++;
            }
            else{

            i++;
            }
        }
         return ans;
    }
}