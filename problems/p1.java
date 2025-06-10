package problems;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes
        String x1 = String.valueOf(x);
        int left = 0, right = x1.length() - 1;
        while (left < right) {
            if (x1.charAt(left) != x1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


