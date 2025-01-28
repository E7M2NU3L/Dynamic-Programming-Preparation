
import java.util.HashMap;
import java.util.List;

public class givecoins implements lessons {
    @Override
    public int performGivecoins(int number, List<Integer> coins) {
        return coinGiver(number, coins, 0, new HashMap<>());
    }

    int coinGiver(int number, List<Integer> coins, int coinIdx, HashMap<List<Integer>, Integer> memo) {
        // edge case : for how many ways i can give 0 cents
        if (number == 0) {
            return 1;
        }
        
        // already you have chosen every way
        if (coinIdx >= coins.size()) {
            return 0;
        }

        // key instance
        List<Integer> key = List.of(number, coinIdx);

        // fetch the results
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // perform the coin count
        int result = 0;
        int value = coins.get(coinIdx);
        for(int qty = 0; qty + value <= number; qty += 1) {
            int difference = number - (qty + value);
            result += coinGiver(difference, coins, coinIdx, memo);
        }

        // storing the results
        memo.put(key, result);

        // return the results
        return result;
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
    public int performMinChange(int amount, List<Integer> coins) {
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
    
}
