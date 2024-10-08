import java.util.LinkedList;
import java.util.Queue;

public class Fila{
    public static void main(String[] args){
        Queue<String> fila = new LinkedList<>();

        fila.offer("1ª da fila");
        fila.offer("2ª da fila");
        fila.offer("3ª da fila");
        fila.offer("4ª da fila");

        System.out.println(fila);
        //Também pode ser usado o metodo peek(), utilizado na pilha para saber qual é o 1º elemento dela.
        //Agora será utilizado outro metodo, para remover o primeiro elemento da lista: poll()
        
    while(!fila.isEmpty()){
        System.out.println(fila.poll());
    }
    System.out.println(fila);
    }
}