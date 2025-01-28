
import java.util.List;

public interface lessons {
    int performMemo(int a);
    boolean performCount(int amount, List<Integer> numbers);
    int performMinChange(int amount, List<Integer> coins);
    int performCountPath(List<List<String>> grid);
    int performfindMaxPath(List<List<Integer>> grid);
    int performNonAdjacentSum(List<Integer> array);
    int performfindMinPerfectSquares(int number);
    int performGivecoins(int number, List<Integer> coins);
};
