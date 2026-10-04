class Solution {
    public boolean checkValidString(String s) {
        
        int minn=0;
        int maxx=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                minn++;
                maxx++;
            }
            else if(ch==')'){
                minn--;
                maxx--;
            }
            else{
                minn--;
                maxx++;
            }
            if(maxx<0) return false;
            if(minn<0) minn=0;
           

        }
        return minn==0;
    }
}