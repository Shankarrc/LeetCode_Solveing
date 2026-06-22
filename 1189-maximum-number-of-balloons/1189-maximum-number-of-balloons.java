class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;

        for(char k:text.toCharArray()){

            if('b'==k){
                b++;
            }
            else if('a'==k){
                a++;
            }
            else if ('l'==k){
                l++;
            }
            else if('o'==k){
                o++;
            }
            else if('n'==k){
                n++;
            }
        }

        int minval=Math.min(Math.min(Math.min(Math.min(b,a),n),l/2),o/2);
        return minval;
    }
}