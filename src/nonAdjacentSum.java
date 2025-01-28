import java.util.HashMap;
import java.util.List;

public class nonAdjacentSum implements lessons {

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
        return adjacentSummer(0, array, new HashMap<>());
    }

    int adjacentSummer(int pos, List<Integer> array, HashMap<List<Integer>, Integer> memo) {
        // boundary conditions
        if (pos >= array.size()) {
            return 0;
        }

        // fetching the values
        if (memo.containsKey(array)) {
            return memo.get(array);
        }

        // perform the result
        int jumper = array.get(pos) + adjacentSummer(pos + 2, array, memo);
        int next = array.get(pos) + adjacentSummer(pos + 1, array, memo);

        int result = Math.max(jumper, next);

        // store the result
        memo.put(array, result);

        // return the results
        return result;
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
