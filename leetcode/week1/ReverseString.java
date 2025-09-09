public class ReverseString {

    public void reverseString(char[] s) {
        int lastIndex = s.length - 1;

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[lastIndex];
            s[lastIndex] = temp;
            lastIndex--;
        }
    }

}
