import java.util.HashMap;
import java.util.List;

public class countSum implements lessons {
    @Override
    public boolean performCount(int amount, List<Integer> numbers) {
        return performSumCount(amount, numbers, new HashMap<>());
    }

    boolean performSumCount(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        // edge cases for 0
        if (amount == 0) {
            return true;
        }

        // negative case
        if (amount < 0) {
            return false;
        }

        // fetch if a memo already exists
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        // calculating the differences
        for (int num : numbers) {
            int differences = amount - num;
            if (performSumCount(differences, numbers, memo)) {
                memo.put(amount, true);
                return true;
            }
        }

        memo.put(amount, false);
        return false;
    }

    @Override
    public int performMemo(int a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int performMinChange(int amount, List<Integer> coins) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performMinChange'");
    }
}
