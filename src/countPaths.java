
import java.util.HashMap;
import java.util.List;

public class countPaths implements lessons {

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
        // inputs can be 2D matrix and a ball coordinates
        // outputs is the number f possible paths to reach the end
        // only right and down movement is allowed
        return pathCounter(0, 0, grid, new HashMap<>());
    }

    int pathCounter(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        // Check if indices are out of bounds
        if (r >= grid.size() || c >= grid.get(0).size()) {
            return 0;
        }
    
        // Check if the current cell is a wall
        if ("X".equals(grid.get(r).get(c))) {
            return 0;
        }
    
        // Check if we reached the bottom-right corner
        if (r == grid.size() - 1 && c == grid.get(0).size() - 1) {
            return 1;
        }
    
        // Check if result is already computed
        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }
    
        // Recursive calculation
        int result = pathCounter(r + 1, c, grid, memo) + pathCounter(r, c + 1, grid, memo);
        memo.put(pos, result);
    
        // Return the result
        return result;
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
