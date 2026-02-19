class Solution {
    public int countBinarySubstrings(String s) {
        
        int curr=1,prev=0,cnt=0;

        for(int i=1;i<=s.length()-1;i++){

            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                cnt+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
         cnt+=Math.min(prev,curr);
         return cnt;
        
    }
}