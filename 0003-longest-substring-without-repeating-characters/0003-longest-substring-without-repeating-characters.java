class Solution {
    public int lengthOfLongestSubstring(String s) {
       
       HashMap<Character,Integer> shan=new HashMap<>();
       int left=0;
       int maxlen=0;
       for(int i=0;i<s.length();i++){

        char ch=s.charAt(i);

            if(shan.containsKey(ch) && shan.get(ch)>=left){
                left=shan.get(ch)+1;
            }
            
            int len=i-left+1;

            maxlen=Math.max(maxlen,len);
            shan.put(ch,i);
       } 
       return maxlen;
    }
}