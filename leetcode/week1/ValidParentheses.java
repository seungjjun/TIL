import java.util.Stack;
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
                continue;
            }
            if (bracket == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
                continue;
            }
            if (bracket == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
                continue;
            }
            stack.push(bracket);
        }
        return stack.isEmpty();
    }
}
