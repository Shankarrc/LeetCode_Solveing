class ProductOfNumbers {
    ArrayList<Integer>shan;
    public ProductOfNumbers() {
        shan =new ArrayList<>();
        shan.add(1);
    }
    
    public void add(int num) {
        
        if(num==0){
            shan =new ArrayList<>();
        shan.add(1);
        }
        else{
    shan.add(shan.get(shan.size()-1)*num);
        }
    
    }
    
    public int getProduct(int k) {
        
        if(k>=shan.size()) return  0;

        return shan.get( shan.size()-1)/shan.get(shan.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */