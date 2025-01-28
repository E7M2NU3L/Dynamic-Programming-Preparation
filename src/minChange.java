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
            return -1;
        }

        // check if the amount exists
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        // a boundary case where nothing returns proper
        int minCoins = -1;

        // go through elements in the coins
        for (int coin : coins) {
            int differences = amount - coin;
            int result =  findmin(differences, coins, memo);

            if (result != -1) {
                int numCoins = result + 1;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }

        // returning the failure results
        memo.put(amount, minCoins);
        return minCoins;
    }

    @Override
    public int performMemo(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean performCount(int amount, List<Integer> numbers) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int performCountPath(List<List<String>> grid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int performfindMaxPath(List<List<Integer>> grid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int performNonAdjacentSum(List<Integer> array) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int performfindMinPerfectSquares(int number) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int performGivecoins(int number, List<Integer> coins) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
