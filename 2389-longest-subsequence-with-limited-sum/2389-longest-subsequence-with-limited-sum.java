class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n = nums.length;
        int m = queries.length;

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1 ; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int[] ans = new int[m];

        

   
        int j = 0;
        for(int q : queries){
            ans[j++] = binSearch(prefix,q);
        }

        return ans;
    }
    int binSearch(int[] prefix,int q){
        int left = 0;
        int right = prefix.length -1;
        
        while(left <= right){
            int mid = (left + right)/2;
            if(prefix[mid] <= q){
                left = mid + 1;
            }else{
                
                right = mid -1;
            }
        
        
        }
        return left;
    }
}