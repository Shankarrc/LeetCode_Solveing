class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        
        List<int[]>image1=new ArrayList<>();
        List<int[]>image2=new ArrayList<>();
        
        int n=img1.length;
         
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){

                if(img1[r][c]==1) image1.add(new int[]{r,c});
                if(img2[r][c]==1) image2.add(new int[]{r,c});
            }
        }
        int max=0;
        HashMap<String,Integer>shan=new HashMap<>();
        for(int []p:image1){
            for(int[]q:image2){

                String str=(p[0]-q[0])+","+(p[1]-q[1]);

                shan.put(str,shan.getOrDefault(str,0)+1);

                max=Math.max(max,shan.get(str));

            }
        }
        return max;
    }
}