import java.util.*;

public class Duplicado
{
    
    public static void duplicados(ArrayList<Integer> numeros){
       for(int i = 0; i < numeros.size(); i++){
           for(int j = i + 1; j < numeros.size(); j++){
               
               if(numeros.get(i).equals(numeros.get(j))){
                   numeros.remove(j);
                   j--;
               }
           }
       }
        
    }
    
	public static void main(String[] args) {
	
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(1);
		numeros.add(40);
		numeros.add(40);
		numeros.add(5);
		numeros.add(9);
		numeros.add(9);
		
		System.out.print(numeros);
		
		duplicados(numeros);
		
		System.out.print(numeros);
	}
}


