class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxd = new ArrayDeque<>();
        Deque<Integer> mind = new ArrayDeque<>();
        int r = 0 ;
        int l = 0;
        int n = nums.length;
        int ans = 0;
        while(r < n){
            while(!maxd.isEmpty() && nums[r] > maxd.peekLast()) maxd.pollLast();
            while(!mind.isEmpty() && nums[r] < mind.peekLast()) mind.pollLast();
            maxd.add(nums[r]);
            mind.add(nums[r]);
            while(maxd.peek() - mind.peek() > limit){
                if (maxd.peek() == nums[l]) maxd.poll();
                if (mind.peek() == nums[l]) mind.poll();
                l++;
                
            }
                ans = Math.max(ans,r-l+1);
                r++;
            
        }
        return ans;
    }
}