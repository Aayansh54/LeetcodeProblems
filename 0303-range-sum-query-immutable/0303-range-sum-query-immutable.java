class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length; i++ ){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix[right] - prefix[left] + arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */