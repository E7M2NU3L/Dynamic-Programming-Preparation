
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // fibonacci experiment
        lessons fibo = new fibonacci();
        lessons Tribo = new tribonacci();
        lessons summer = new countSum();
        lessons min = new minChange();
        lessons paths = new countPaths();
        lessons max = new maxPath();
        lessons adjacent = new nonAdjacentSum();
        lessons perfect = new perfectSquares();
        lessons coin = new givecoins();

        System.out.println(" ");

        // outputs of fibonacci experiment
        System.out.print("Result of the Fibonacci for 6: ");
        System.out.println(fibo.performMemo(6));

        System.err.println(" ");

        // outputs of the tribonacci experiment
        System.err.print("Result of the Tribonacci for 12: ");
        System.out.println(Tribo.performMemo(12));

        System.err.println(" ");

        // outputs of the counter experiment
        int amount = 15;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("amount: " + amount);
        System.err.println("numbers: "+ numbers);
        System.err.print("Results of the Sum Counter Experiment for some example inputs: ");
        System.out.println(summer.performCount(amount,numbers));

        System.err.println(" ");

        // outputs of the find min Change experiment
        int change = 12;
        List<Integer> coins = new ArrayList<>();
        coins.add(2);
        coins.add(4);
        coins.add(3);
        coins.add(7);
        coins.add(3);
        coins.add(5);
        coins.add(5);
        System.out.println("change: " + change);
        System.err.println("coins: "+ coins);
        System.err.print("Results of the find minimum change Experiment for some example inputs: ");
        System.out.println(min.performMinChange(change, coins));

        System.err.println(" ");

        // outputs of the count path experiment
        List<List<String>> grid = new ArrayList<>();
        grid.add(Arrays.asList("O", "O", "X"));
        grid.add(Arrays.asList("O", "O", "O"));
        grid.add(Arrays.asList("O", "O", "O"));
        System.out.println("Input Grid:");
        for (List<String> row : grid) {
            System.out.println(row);
        }
        System.out.println("Number of paths to reach the endpoint");
        System.out.println(paths.performCountPath(grid));

        System.err.println(" ");

        // outputs of the find max paths experiment
        List<List<Integer>> numericalgrid = new ArrayList<>();
        numericalgrid.add(Arrays.asList(1, 3, 12));
        numericalgrid.add(Arrays.asList(5, 6, 2));
        System.out.println("Input Grid:");
        for (List<Integer> numrow : numericalgrid) {
            System.out.println(numrow);
        }
        System.out.print("Results for finding the max cost path for this numerical grid is: ");
        System.out.println(max.performfindMaxPath(numericalgrid));

        System.out.println(" ");

        // outputs of the max cost of non adjacent sum experiment
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(12);
        array.add(7);
        System.out.print("Input Grid: ");
        System.out.println(array);
        System.out.print("The maximum cost of the adjacent paths are: ");
        System.out.println(adjacent.performNonAdjacentSum(array));

        System.out.println("");

        // outputs for the perfect squares problem
        int testnumber = 12;
        System.out.println("The minimum number of perfect squares needed to arrive to "+ testnumber + " is: " + perfect.performfindMinPerfectSquares(testnumber));

        System.out.println(" ");

        // outputs for coins and changes pattern counter problem
        int testChange = 5;
        List<Integer> testcoins = new ArrayList<>();
        testcoins.add(1);
        testcoins.add(2);
        testcoins.add(3);
        System.out.println("The number of patterns in which the changes can be given from " + testcoins + " for the amount of " + testChange + " can be: " + coin.performGivecoins(testnumber, coins));
    }
}
