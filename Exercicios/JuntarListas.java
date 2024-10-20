import java.util.*;

public class JuntarListas
{
	public static void main(String[] args) {
	    
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> listaAlternada = new ArrayList<>();
		
		lista1.add(1);
		lista1.add(3);
		lista1.add(5);
		lista2.add(2);
		lista2.add(4);
		lista2.add(6);
		
	
		int tamanhoListas = Math.max(lista1.size(),lista2.size());
		
		for(int i=0; i < tamanhoListas; i++){
		   
		   if( i < lista1.size()){
		     listaAlternada.add(lista1.get(i));  
		   } if(i < lista1.size()){
		      listaAlternada.add(lista2.get(i));  
		   }
		}
		
		System.out.println("==LISTA 01==\n");
		for(int i : lista1){
		  System.out.print(i + " ");  
		};
		
		System.out.println("\n\n==LISTA 02==\n");
		for(int i : lista2){
		  System.out.print(i + " ");  
		};
		
		System.out.println("\n\n==LISTA ALTERNADA==\n");
		for(int i : listaAlternada){
		  System.out.print(i + " ");  
		};
		
		
	}
}

