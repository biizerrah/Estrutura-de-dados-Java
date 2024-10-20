import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		ArrayList<Integer> lista = new ArrayList<>();
	    ArrayList<Integer> listaInvertida = new ArrayList<>();
		
		lista.add(5);
	    lista.add(100);
		lista.add(10);
		lista.add(4);
		lista.add(1);
		lista.add(50);
		
		System.out.print("LISTA ORIGINAL: ");
		System.out.print(lista);
		
	    System.out.println("\n==================================");
	    System.out.print("LISTA INVERTIDA: ");
	    for(int i = lista.size() - 1; i>=0; i--){
	        listaInvertida.add(lista.get(i));
	       }
	   System.out.print(listaInvertida);
	}
}

