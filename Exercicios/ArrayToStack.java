import java.util.*;

public class ArrayToStack {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Antes da inversão: " + numbers);
        invertArrayList(numbers);
        System.out.println("Depois da inversão: " + numbers);
    }

    public static void invertArrayList(ArrayList<Integer> list) {
        Stack<Integer> stack = new Stack<>();

        
        for (Integer number : list) {
            stack.push(number);
        }

        
        for (int i = 0; i < list.size(); i++) {
            list.set(i, stack.pop());
        }
    }
}


