import java.util.Stack;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(prices[0]);

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];

            Integer previousPrice = stack.peek();
            if (previousPrice > price) {
                stack.push(price);
                continue;
            }
            if (previousPrice < price) {
                int profit = price - previousPrice;
                answer = Math.max(answer, profit);
            }
        }

        return answer;
    }
}
