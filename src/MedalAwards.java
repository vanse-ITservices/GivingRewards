
import java.util.ArrayList;
import java.util.Collections;

public class MedalAwards {
    public static void main(String[] args) {
        // Create an ArrayList to store the numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);

        // Sort the numbers in ascending order
        Collections.sort(numbers);

        // Determine the medal ranks
        int goldenMedal = numbers.get(0);
        int silverMedal = numbers.get(1);
        int bronzeMedal = numbers.get(2);
        int fourMedal   = numbers.get(3);
        int fiverMedal  = numbers.get(numbers.size() - 1);

        System.out.println("Golden Medal: " + goldenMedal);
        System.out.println("Silver Medal: " + silverMedal);
        System.out.println("Bronze Medal: " + bronzeMedal);
        System.out.println("Four Medal: " + fourMedal);
        System.out.println("Fiver Medal: " + fiverMedal);
    }
}
