class Solution {
    public boolean check(char close,char open){

        if(close==']' && open=='[' ||close=='}' && open=='{'||close==')' && open=='('){
            return true;
        }
        return false;

    }
    public boolean isValid(String s) {
        

        int n=s.length();
        Stack<Character>shan=new Stack<>();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);

            if(ch=='['||ch=='{'||ch=='('){
                shan.add(ch);
            }
            else{

                if(shan.isEmpty()) return false;
                else{

                    char  val=shan.pop();

                    if(!check(ch,val)) return false;
                }
            }


        }
        return shan.isEmpty()?true:false;
    }
}