class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       
        int left =0;
        HashMap<Character,Integer> ans=new HashMap<>();
        int maxlen=0;
        for(int right=0;right<s.length();right++){

                char ch=s.charAt(right);
            if(ans.containsKey(ch) && ans.get(ch)>=left){
                left=ans.get(ch)+1;
            }

            maxlen=Math.max(maxlen,right-left+1);
            ans.put(ch,right);
        }
        return maxlen;
    }
}