import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {
            if (operation.equals("+")) {
                int previousIndex = stack.size() - 1;
                int newScore = stack.get(previousIndex) + stack.get(previousIndex - 1);
                stack.push(newScore);
                continue;
            }
            if (operation.equals("D")) {
                stack.push(stack.peek() * 2);
                continue;
            }
            if (operation.equals("C")) {
                stack.pop();
                continue;
            }

            stack.push(Integer.parseInt(operation));
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}
