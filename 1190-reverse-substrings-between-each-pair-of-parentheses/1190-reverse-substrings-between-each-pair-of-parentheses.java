class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder str=new StringBuilder(s);

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==')'){

                int end=i;
                int st=str.lastIndexOf("(",end);
                String mid=str.substring(st+1,end);
                String rev=new StringBuilder(mid).reverse().toString();
                str.replace(st,end+1,rev);
                i-=2;

            }
        }
        return str.toString();
    }
}