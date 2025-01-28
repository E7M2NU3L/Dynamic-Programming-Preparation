import java.util.HashMap;
import java.util.List;

public class minChange implements lessons {
    @Override
    public int performMinChange(int amount, List<Integer> coins) {
            return findmin(amount, coins, new HashMap<>());
        }

    int findmin(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
        // find if the amount is 0
        if (amount == 0) {
            return 0;
        }

        // find if the amount is negative
        if (amount < 0) {
            return 0;
        }

        // check if the amount exists
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        // go through elements in the coins
        for (int coin : coins) {
            int differences = amount - coin;
            int result =  findmin(differences, coins, memo);
            memo.put(differences, result);
            return result;
        }

        return 0;
    }

    @Override
    public int performMemo(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean performCount(int amount, List<Integer> numbers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
