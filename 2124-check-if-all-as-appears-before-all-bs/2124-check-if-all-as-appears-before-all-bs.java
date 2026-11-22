class Solution {
    public boolean checkString(String s) {
        boolean seenB=false;
        for(char a:s.toCharArray()){

            if(a=='b'){
                seenB=true;
            }
            if(a=='a' && seenB){
                return false;
            }
        }
        return true;
    }
}