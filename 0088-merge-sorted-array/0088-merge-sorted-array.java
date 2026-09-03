class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] nums3 = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        for (int p = 0; p < (m + n); p++) {
            nums1[p] = nums3[p];
        }
    }
}