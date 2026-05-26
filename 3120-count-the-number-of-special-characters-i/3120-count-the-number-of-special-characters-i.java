class Solution {
    public int numberOfSpecialChars(String word) {
        
        int lower[]=new int[26];
        int upper[]=new int[26];

        for(char a:word.toCharArray()){

            if(Character.isLowerCase(a)){
                lower[a-'a']++;
            }
            else{
                upper[a-'A']++;
            }
        }
        int ans=0;
        for(int i=0;i<26;i++){

            if(lower[i]>0 && upper[i]>0){
                ans++;
            }
        }
        return ans;
    }
}