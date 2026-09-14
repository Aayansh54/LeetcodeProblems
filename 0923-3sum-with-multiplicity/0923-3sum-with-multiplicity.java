class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        long ans = 0;
        long MOD = 1_000_000_007;
        if (n < 3)
            return (int) ans;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                long sum = (long)arr[i] + arr[j] + arr[k];
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else if (arr[j] != arr[k]) {
                    int left = 1;
                    int right = 1;
                    while (j + 1 < k && arr[j] == arr[j + 1]) {
                        j++;
                        left++;
                    }
                    while (k - 1 > j && arr[k] == arr[k - 1]) {
                        k--;
                        right++;
                    }
                    ans += (long) (left * right) % MOD;     
                    j++;
                    k--;
                } else {
                    long count = k - j + 1;
                    ans += (count * (count - 1) / 2);
                    ans = ans % MOD;
                    break;
                }
            }
        }
        return (int) ans;
    }
}