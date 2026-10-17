class ProductOfNumbers {

    ArrayList<Integer> stream = new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        stream.add(num);
    }
    
    public int getProduct(int k) {
        int n = stream.size();
        int ans = 1;
        for(int j = n - 1 ; j >= n - k  ; j--){
            ans *= stream.get(j);
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */