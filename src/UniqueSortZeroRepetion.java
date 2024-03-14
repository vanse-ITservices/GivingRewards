import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueSortZeroRepetion {

        public static void main(String[] args) {

            Scanner number = new Scanner(System.in);

            ArrayList<Integer> numbers = new ArrayList<>(); // arraylist
            System.out.print("Enter integers 10 : "); //output for inserting number
            for (int i = 1; i<=10; i++){ // loop until 10 integers ara inserted

                int temp = number.nextInt(); //accepted the inserted integers

                if (!numbers.contains(temp)) // scan if the integer does not exist in the array before inserting
                    numbers.add(temp); // add to the arraylist after scan from the above
            }
            Collections.sort(numbers); // sort the collection in order... from lowest to highest
            System.out.println(numbers); // output the number to the users
        }
    }
