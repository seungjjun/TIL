import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        final int lemonadePrice = 5;
        Map<Integer, Integer> change = new HashMap<>();
        for (int bill : bills) {
            int changeMoney = bill - lemonadePrice;
            if (changeMoney == 0) {
                change.put(bill, change.getOrDefault(bill, 0) + 1);
                continue;
            }
            int twentyDollars = changeMoney / 20;
            while (twentyDollars > 0 && change.containsKey(20)) {
                changeMoney = extractMoney(change, changeMoney, 20);
                twentyDollars--;
            }

            int tenDollars = changeMoney / 10;
            while (tenDollars > 0 && change.containsKey(10)) {
                changeMoney = extractMoney(change, changeMoney, 10);
                tenDollars--;
            }

            int fiveDollars = changeMoney / 5;
            while (fiveDollars > 0 && change.containsKey(5)) {
                changeMoney = extractMoney(change, changeMoney, 5);
                fiveDollars--;
            }

            change.put(bill, change.getOrDefault(bill, 0) + 1);
            if (changeMoney != 0) {
                return false;
            }
        }
        return true;
    }

    private int extractMoney(Map<Integer, Integer> change, int changeMoney, int bill) {
        if (change.containsKey(bill)) {
            change.put(bill, change.get(bill) - 1);
            if (change.get(bill) == 0) {
                change.remove(bill);
            }
            changeMoney -= bill;
        }
        return changeMoney;
    }
}
