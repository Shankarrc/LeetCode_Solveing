class Solution {
    public int[] sortByBits(int[] arr) {
       HashMap<Integer,List<Integer>>ans=new HashMap<>();

       for(int a:arr){

        int b=Integer.bitCount(a);
        ans.computeIfAbsent(b,k->new ArrayList<>()).add(a);
       } 

       List<Integer>res=new ArrayList<>(ans.keySet());
       Collections.sort(res);

    List<Integer>answer=new ArrayList<>();

       for(int a:res){

        List<Integer>li=ans.get(a);
        Collections.sort(li);
        answer.addAll(li);
       }

       int fin[]=new int [answer.size()];
       for(int i=0;i<answer.size();i++){
            fin[i]=answer.get(i);
       }
       return fin;
    }
}