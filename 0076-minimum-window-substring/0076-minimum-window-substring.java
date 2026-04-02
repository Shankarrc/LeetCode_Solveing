class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character,Integer>shan=new HashMap<>();

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            shan.put(ch,shan.getOrDefault(ch,0)+1);
        }

        int l=0,r=0;
        int cnt=0;
        int m=t.length();
        int minlen=Integer.MAX_VALUE,str=-1;


        while(r<s.length()){
            
            char ch=s.charAt(r);

            if(shan.containsKey(ch) ){
                if( shan.get(ch)>0)cnt++;
                shan.put(ch,shan.get(ch)-1);
            }

            while(cnt==m){



                if((r-l+1)<minlen){
                    minlen=r-l+1;
                    str=l;
                }

                char c=s.charAt(l);

                if(shan.containsKey(c)){

                    shan.put(c,shan.get(c)+1);

                    if(shan.get(c)>0)cnt--;
                }

                l++;

            }

            r++;
        }
        return str==-1?"":s.substring(str,str+minlen);
    }
}