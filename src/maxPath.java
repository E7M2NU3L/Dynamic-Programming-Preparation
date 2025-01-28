
import java.util.HashMap;
import java.util.List;

public class maxPath implements lessons {

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
        // starting the function recursively with row and col point to be zero
        return findmaxPath(0, 0, grid, new HashMap<>());
    }

    double findMaxPathSoln2(int row, int col, List<List<Integer>> grid, HashMap<List<Integer>, Double> memo) {
        // falling beyond the boundary
        if (row <= grid.size() || col >= grid.get(0).size()) {
            return Double.NEGATIVE_INFINITY;
        }

        // boundary conditions
        if (row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return grid.get(row).get(col);
        }

        // current Position
        List<Integer> pos = List.of(row, col);

        // fetching the results
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        // perform the result
        double result = grid.get(row).get(col) + Math.max(
            findMaxPathSoln2(row + 1, col, grid, memo), 
            findMaxPathSoln2(row, col + 1, grid, memo)
        );

        // store the results;
        memo.put(pos, result);

        // return the result
        return result;
    }

    int findmaxPath(int row, int col, List<List<Integer>> grid, HashMap<List<Integer>, Integer> memo) {
        // check if the rows and columns reached beyond the matrix
        if (row >= grid.size() || col >= grid.get(0).size()) {
            return 0;
        }
        
        // check if the tree is already in the endpoint
        if (row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return grid.get(row).get(col);
        }

        // fetch the results
        List<Integer> pos = List.of(row, col);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        // performing the results
        int movebyRow = findmaxPath(row + 1, col, grid, memo);
        int moveByCol = findmaxPath(row, col +1 , grid, memo);

        // Calculate the maximum path sum from the current position
        int maxPath = grid.get(row).get(col) + Math.max(movebyRow, moveByCol);

        // Memoize the result
        memo.put(pos, maxPath);

        // Return the maximum path sum
        return maxPath;
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
