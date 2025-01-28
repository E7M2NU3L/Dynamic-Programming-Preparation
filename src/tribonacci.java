import java.util.HashMap;
import java.util.List;

public class tribonacci implements lessons {
    @Override
    public int performMemo(int n) {
        return performTribo(n, new HashMap<>());
    }

    int performTribo(int n, HashMap<Integer, Integer> memo) {
        // side quests
        if (n == 0 || n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        // check if memo has key
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // store the results
        int result = performTribo(n - 1, memo) + performTribo(n - 2, memo) + performTribo(n - 3, memo);
        memo.put(n, result);

        // return the results
        return result;
    }

    @Override
    public boolean performCount(int amount, List<Integer> numbers) {
        throw new UnsupportedOperationException("Unimplemented method 'performCount'");
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

    @Override
    public int performGivecoins(int number, List<Integer> coins) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
