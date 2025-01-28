
import java.util.HashMap;
import java.util.List;

public class perfectSquares implements lessons {

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
        return (int) findperfectSquares(number, new HashMap<>());
    }
    
    double findperfectSquares(int number, HashMap<Integer, Double> memo) {
        // edge case: if input is 0
        if (number == 0) {
            return 0;
        }

        // edge case: if input is negative
        if (number < 0) {
            return 0;
        }

        // fetch the results
        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        // perform the result
        double minSquares = Double.POSITIVE_INFINITY;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            int square = i * i;
            int difference = number - square;
            double numSquares = 1 + findperfectSquares(difference, memo);
            if (numSquares < minSquares) {
                minSquares = numSquares;
            }
        }

        // store the results
        memo.put(number, minSquares);

        // returning the results
        return minSquares;
    }

    @Override
    public int performGivecoins(int number, List<Integer> coins) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
