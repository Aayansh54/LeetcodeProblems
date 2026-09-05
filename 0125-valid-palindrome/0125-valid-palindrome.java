class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int i = 0;
        int j = lower.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(lower.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(lower.charAt(j))) {
                j--;
                continue;
            }
            if (lower.charAt(i) != lower.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}