import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RewardsRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the positions
        ArrayList<Integer> positions = new ArrayList<>();
        positions.add(1); // Position 1
        positions.add(2); // Position 2
        positions.add(3); // Position 3
        positions.add(4); // Position 4
        positions.add(5); // Position 5

        // Create a map to associate positions with medals
        Map<Integer, String> medals = new HashMap<>();
        medals.put(1, "Golden medal");
        medals.put(2, "Silver medal");
        medals.put(3, "Bronze medal");
        medals.put(4, "Four medal");
        medals.put(5, "Fiver medal");

        System.out.print("Enter the racer's position (1-5): ");
        int racerPosition = scanner.nextInt();

        // Validate input position
        if (racerPosition >= 1 && racerPosition <= 5) {
            String reward = medals.get(racerPosition);
            System.out.println("Racer's reward: " + reward);
        } else {
            System.out.println("Invalid position. Please enter a position between 1 and 5.");
        }

        scanner.close();
    }
}

