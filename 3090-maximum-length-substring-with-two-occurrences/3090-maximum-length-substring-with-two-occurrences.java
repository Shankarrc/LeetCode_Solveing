class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int cnt[]=new int[26];
        int maxlen=0;
        for(int r=0;r<s.length();r++){
            cnt[s.charAt(r)-'a']++;
            while(cnt[s.charAt(r)-'a']>2){
                cnt[s.charAt(l)-'a']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);

        }
        return maxlen;
    }
}