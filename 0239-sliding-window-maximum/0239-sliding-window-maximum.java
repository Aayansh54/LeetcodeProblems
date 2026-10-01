class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        int r=0;
        int[] ans = new int[n-k+1];
        int i = 1;

        Deque<Integer> max=new ArrayDeque<>();
        for(r=0;r<k;r++){
            while(!max.isEmpty() && nums[max.peekLast()] < nums[r]){
                max.pollLast();
            }
        max.addLast(r);
        }
        int MAX = nums[max.peekFirst()];
        ans[0] = MAX;
        

        while(r<n){

            while(!max.isEmpty() && nums[max.peekLast()] < nums[r]){
                max.pollLast();
            }
            max.addLast(r);
            
            if(max.peekFirst()==l){
                max.pollFirst();
            }
            MAX = nums[max.peekFirst()];
            ans[i++] = MAX;
            l++;
            r++;
        }
        return ans;
    }
}