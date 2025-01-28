
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // fibonacci experiment
        lessons fibo = new fibonacci();
        lessons Tribo = new tribonacci();
        lessons summer = new countSum();
        lessons min = new minChange();

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

        // outputs of the find min Change experiment
        System.err.print("Results of the find minimum change Experiment for some example inputs: ");
        System.out.println(min.performMinChange(amount, numbers));
    }
}
