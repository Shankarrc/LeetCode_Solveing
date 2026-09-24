class Solution {
    public int maxVowels(String s, int k) {

        HashSet<Character>vowel=new HashSet<>(Set.of('a','e','i','o','u'));
        int window=0;
        int maxx=0;
        for(int i=0;i<k;i++){

            if(vowel.contains(s.charAt(i))){
                window++;
            }
        }
        maxx=window;
        for(int i=k;i<s.length();i++){

            if(vowel.contains(s.charAt(i-k))){
                window--;
            }
            if(vowel.contains(s.charAt(i))){
                window++;
            }
            maxx=Math.max(maxx,window);
        }
        return maxx;


    }
}