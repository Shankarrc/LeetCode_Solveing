class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str=new StringBuilder();

        for(String s:words){

            int sum=0;
            for(int i=0;i<s.length();i++){
                sum+=weights[s.charAt(i)-'a'];
            }
            sum=sum%26;
            char ch=(char)('z'-sum);
            str.append(ch);
            
        }
        return str.toString();
    }
}