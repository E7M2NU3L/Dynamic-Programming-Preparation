import java.util.HashMap;
import java.util.List;

public class fibonacci implements lessons {
    @Override
    public int performMemo(int n) {
        return performFibo(n, new HashMap<>());
    }

    int performFibo(int n, HashMap<Integer, Integer> memo) {
        // check if n is zero or one
        if (n == 0 || n == 1) {
            return n;
        }

        // return the stored value if it exists
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // store the result
        int result =  performFibo(n - 1, memo) + performFibo(n - 2, memo);
        memo.put(n, result);

        // return the result
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
}
