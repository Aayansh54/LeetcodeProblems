class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int size = m + n;
        int leftel = (m + n + 1) / 2;
        int left = 0;
        int right = m;
        while (left <= right) {

            int mid1 = (left + right) / 2;
            int mid2 = leftel - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1 != 0) l1 = nums1[mid1 - 1];
            if(mid1 != m) r1 = nums1[mid1];

            if(mid2 != 0 ) l2 = nums2[mid2 - 1];
            if(mid2 != n ) r2 = nums2[mid2];

            if (l1 > r2) {
                right = mid1 - 1;
            } else if (l2 > r1) {
                left = mid1 + 1;
            } else {
                if (size % 2 == 0)
                    return (Math.max(l1, l2) + (double) Math.min(r1, r2)) / 2;
                else
                    return (double) (Math.max(l1, l2));
            }
        }
        return 0;
    }
}