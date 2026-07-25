class Solution {
    public int maxProduct(int n) {
        
        List<Integer>shan=new ArrayList<>( );
        

        int m=0;
        while(n>0){
            int dit=n%10;
            shan.add(dit);
            m++;
            n/=10;
        }
        if(m==1) return n;
        
        Collections.sort(shan);
        int si=shan.size();
        return shan.get(si-2)*shan.get(si-1);
        // int f=0;

        // int temp=n;
        // int index=0;
        // while(temp>0){

        //     int digit=temp%10;
        //     if(f<digit){
        //         index++;
        //         f=digit;
        //     }
           
        //     temp/=10;
        // }
        // temp=n;
        // int s=0;
        // int i=0;
        //  while(temp>0){

        //     int digit=temp%10;

        //     if(f>=digit && i<=index ){
        //         s=digit;
        //         i++;
        //     }
            
        //     temp/=10;
        // }
        // return s*f;
    }
}