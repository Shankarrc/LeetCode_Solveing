class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>shan=new HashMap<>();

        int n=t.length();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            shan.put(ch,shan.getOrDefault(ch,0)+1);
        }
        int r=0;
        int l=0;
        int start=-1;
        int minlen=Integer.MAX_VALUE;
        int cnt=0;

        while(r<s.length()){
            char ch=s.charAt(r);
            if(shan.containsKey(ch)){

                 if(shan.get(ch)>0){
                cnt++;
            }
                shan.put(ch,shan.get(ch)-1);
            }
           
            while(cnt==n){

                if((r-l+1)<minlen){
                    minlen=r-l+1;
                    start=l;
                }
                char c=s.charAt(l);
                if(shan.containsKey(c)){
                shan.put(c,shan.get(c)+1);

                if(shan.get(c)>0) cnt--;

                }
                l++;

            }
            r++;
        }
        return start==-1?"":s.substring(start,start+minlen);
    }
}