class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        int[] prefix = new int[n + 1];

        prefix[0] = 0;
    for (int i = 0; i < n; i++) {
    prefix[i + 1] = prefix[i] + nums[i];
}

        int ans = n+1;
        Deque<Integer> deq = new ArrayDeque<>();

        for(int r = 0; r <= n ; r++){

            while(!deq.isEmpty() && prefix[r] < prefix[deq.peekLast()]) deq.pollLast();
            while(!deq.isEmpty() && prefix[r] - prefix[deq.peekFirst()] >= k){
                ans = Math.min(ans,r- deq.peekFirst());
                deq.pollFirst();
            }
            deq.addLast(r);
        }
        return ans == n + 1 ? -1 : ans;
    }
}