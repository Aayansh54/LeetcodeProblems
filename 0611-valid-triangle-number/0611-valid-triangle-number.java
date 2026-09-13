class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int triplets = 0;
        for(int i = 0 ; i < n-2 ; i++ ){
            if(nums[i] == 0) continue;
            for(int j = i+1; j < n-1 ; j++){
                if(nums[j] == 0) continue;
                int sum = nums[i] + nums[j];
                int k = BinSearch(j,n,sum,nums);
                triplets += k - j;
            }
        }
        return triplets;
    }
    int BinSearch(int j , int n , int sum,int[] nums){
        int ans = j;
        int left = j + 1;
        int right = n - 1;
        while(left <= right){
            int mid =( left + right )/2;
            if(nums[mid] < sum){
                left = mid + 1;
                ans = mid;
            }
            else
               right = mid - 1;
        }
        return ans;
    }
}