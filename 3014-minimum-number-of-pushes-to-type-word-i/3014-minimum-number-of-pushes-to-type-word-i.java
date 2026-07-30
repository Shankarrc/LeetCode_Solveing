class Solution {
    public int minimumPushes(String word) {
        String [] keypad={
            "*",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
         

        int tot=0;
        for(int i=0;i<word.length();i++){

            tot+=(i/8)+1;
        }
        return tot;

        
    }
}