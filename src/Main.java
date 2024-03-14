import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i<=10; i++){
            System.out.print("Enter integers " + i +" :");
                numbers.add(number.nextInt());}
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}