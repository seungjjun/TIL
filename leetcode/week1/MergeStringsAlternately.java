public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int left1 = 0;
        int left2 = 0;

        while (left1 < word1.length() && left2 < word2.length()) {
            answer.append(word1.charAt(left1++));
            answer.append(word2.charAt(left2++));
        }

        if (left1 >= word1.length()) {
            answer.append(word2.substring(left2));
        }
        if (left2 >= word2.length()) {
            answer.append(word1.substring(left1));
        }

        return answer.toString();
    }
}
