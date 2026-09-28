class Solution {
    public int maxDepth(String s) {
        
        int cnt=0;
        int maxx=0;
        for(char a:s.toCharArray()){

            if(a=='('){
                cnt++;
                maxx=Math.max(maxx,cnt);
            }
            else if(a==')'){
                cnt--;
            }
        }
        return maxx;
    }
}