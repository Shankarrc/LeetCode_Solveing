class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        StringBuilder str=new StringBuilder(word);

    int cnt=0;
    for(String s:patterns){

        if(str.indexOf(s)!=-1){
            cnt++;
        }
    }
    return cnt;
    }
}