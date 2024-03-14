import java.util.Arrays;

public class Position {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example array of numbers

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Determine the medal ranks
        int goldenMedal = numbers[0];
        int silverMedal = numbers[1];
        int bronzeMedal = numbers[numbers.length - 1];

        System.out.println("Golden Medal: " + goldenMedal);
        System.out.println("Silver Medal: " + silverMedal);
        System.out.println("Bronze Medal: " + bronzeMedal);
    }
}