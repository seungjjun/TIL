public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder answer = new StringBuilder();
        int index = 0;
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        while (minLength > index) {
            char tempPrefix = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(index) != tempPrefix) {
                    return answer.toString();
                }
                if (i == strs.length - 1) {
                    answer.append(tempPrefix);
                }
            }
            index++;
        }
        return answer.toString();
    }

}
