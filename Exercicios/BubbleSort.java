import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Antes da ordenação: " + numbers);
        bubbleSortDecrescente(numbers);
        System.out.println("Depois da ordenação: " + numbers);
    }

    public static void bubbleSortDecrescente(ArrayList<Integer> list) {
    
        boolean swapped;
        
        for (int i = 0; i < list.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) < list.get(j + 1)) { 
                    // Troca os elementos
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            
            if (!swapped) break;
        }
    }
}


