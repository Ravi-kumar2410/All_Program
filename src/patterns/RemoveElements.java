package patterns;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            if (currentNumber % 2 == 0) {
                iterator.remove(); // Removes the current element from the list
            }
        }

        System.out.println("Array after removing even numbers: " + numbers);
    }
}