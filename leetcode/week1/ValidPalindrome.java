public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        boolean answer = true;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(right)) {
                return false;
            }
            right--;
        }

        return answer;
    }
}
