class Solution {
    public boolean isHappy(int n) {
        int fast = n,slow = n;
      do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            
        }  while (fast != slow);
        return fast == 1;
    }

    public int squareSum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            sum += digit * digit;
            n/=10;
        }
        return sum;
    }
}