public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int right = s.length() - 1;

        for (int left = 0; left < right; left++) {
            if (s.charAt(left) == s.charAt(right)) {
                right--;
                continue;
            }

            return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
