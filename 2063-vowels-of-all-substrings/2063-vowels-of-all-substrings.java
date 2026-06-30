class Solution {
    public long countVowels(String word) {
        long sum=0;
    HashSet<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
    long len=word.length();
        for(int i=0;i<len;i++){

            if(vowels.contains(word.charAt(i))){
                sum+=(i+1)*(len-i);
            }
        }
        return sum;
    }
}