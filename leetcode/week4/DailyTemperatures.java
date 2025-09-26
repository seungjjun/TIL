import java.util.Stack;

public class DailyTemperatures {

    static class Pair {
        private final int index;
        private final int temperature;

        public Pair(int index, int temperature) {
            this.index = index;
            this.temperature = temperature;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answers = new int[temperatures.length];
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];

            while (!stack.isEmpty() && stack.peek().temperature < temperature) {
                Pair pair = stack.pop();
                answers[pair.index] = i - pair.index;
            }
            stack.push(new Pair(i, temperature));
        }
        return answers;
    }

}
