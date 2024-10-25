
import java.util.ArrayList;
import java.util.List;

class Grafo {
    private List<List<Integer>> adjacencias;

    public Grafo(int vertices){
        adjacencias = new ArrayList<>();
        for(int i = 0; i < vertices; i++){
            adjacencias.add(new ArrayList<>());
        }
    }

    public void addVertices(int vertice1, int vertice2){

        adjacencias.get(vertice1).add(vertice2);
        
    }

    public void printAdj(){
        for (int i = 0; i < adjacencias.size(); i++) {
            System.out.print("As vertices " + i + " possuem adjacência com ");
            for (int vertice : adjacencias.get(i)) {
                System.out.print("as vertices: " + vertice + " ");
            }

            System.out.println();
        }
    }
}
public class Grafos{
    public static void main(String[] args){

        Grafo grafo = new Grafo(6);

        grafo.addVertices(0, 2);
        grafo.addVertices(1, 0);
        grafo.addVertices(4, 3);
        grafo.addVertices(5, 4);
        grafo.addVertices(3, 5);
        grafo.addVertices(4, 1);
        grafo.addVertices(1, 3);
      
        grafo.printAdj();
    }
}