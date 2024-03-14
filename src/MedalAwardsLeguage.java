

import java.util.ArrayList;
import java.util.Arrays;

public class MedalAwardsLeguage {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 8}; // Example array of numbers

        ArrayList<String> medals = awardMedals(numbers);

        System.out.println("Medals awarded according to the numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + numbers[i] + " - " + medals.get(i) + " medal");
        }
    }

    public static ArrayList<String> awardMedals(int[] numbers) {
        ArrayList<String> medals = new ArrayList<>();

        // Copy the numbers into a separate array to avoid modifying the original
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers); // Sort the numbers

        // Award medals based on the sorted order
        for (int i = 0; i < numbers.length; i++) {
            String medal = getString(numbers, sortedNumbers, i);

            medals.add(medal); // Add the medal to the list
        }

        return medals;
    }

    private static String getString(int[] numbers, int[] sortedNumbers, int i) {
        int index = Arrays.binarySearch(sortedNumbers, numbers[i]); // Find the index of the number in sorted order
        int medalIndex = numbers.length - index; // Calculate medal index based on position in sorted array
        String medal;
        if (medalIndex == 1)
            medal = "gold";
        else if (medalIndex == 2)
            medal = "silver";
        else if (medalIndex == 3)
            medal = "bronze";
        else
            medal = "no medal";
        return medal;
    }
}
