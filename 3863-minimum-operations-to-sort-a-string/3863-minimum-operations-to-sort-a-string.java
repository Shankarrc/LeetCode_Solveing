class Solution {
    public int minOperations(String s) {
        int n=s.length();
        char []str=s.toCharArray();
        boolean sort=true;
        for(int i=1;i<n;i++){

            if(str[i]<str[i-1]){
                sort=false;
                break;
            }
        }
        if(sort)return 0;
        if(n==2) return -1;
        char min='z';
        char max='a';
        for(char ch:str){

            if(ch>max)max=ch;
            if(ch<min)min=ch;
        }
        if(str[0]==min ||str[n-1]==max) return 1;
        int maxCount=0;
        int minCount=0;
        for(char ch:str){

            if(ch==min)minCount++;
            if(ch==max)maxCount++;
        }
        if(str[0]==max && maxCount==1  && str[n-1]==min && minCount==1){
            return 3;
        }
        return 2;
    }
}