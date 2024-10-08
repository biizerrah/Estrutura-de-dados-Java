import java.util.LinkedList;
import java.util.Queue;

public class Pedido { 
    private int nPedido;
    private String[] itens;
    private float preco;

    public Pedido(int nPedido, String[] itens,float preco){
        this.nPedido = nPedido;
        this.itens = itens;
        this.preco = preco;
    }
    public static void main(String[] args){

        Queue<Pedido> fila = new LinkedList<>();

        String[] listaItens1 = {"Xburguer", "Refrigerante", "Misto","Pizza"};
        String[] listaItens2 = {"Xburguer", "Refrigerante", "Misto","Pizza", "Cerveja", "torta"};
        String[] listaItens3 = {"Xburguer", "Refrigerante", "Misto"};
        String[] listaItens4 = {"Xburguer", "Cerveja","Pizza", "sorvete"};

        Pedido pedido1 = new Pedido(123, listaItens1, 50.60f);
        Pedido pedido2 = new Pedido(598, listaItens2, 100.10f);
        Pedido pedido3 = new Pedido(873, listaItens3, 22.00f);
        Pedido pedido4 = new Pedido(569, listaItens4, 55.40f);

        fila.offer(pedido1);
        fila.offer(pedido2);
        fila.offer(pedido3);
        fila.offer(pedido4);

        while (!fila.isEmpty()) { 
         Pedido tempPedido = fila.poll();
         System.out.println("Itens: ");
         for(String item : tempPedido.itens){
            System.out.println("  " + item);
         }
         System.out.println("Número do Pedido: " + tempPedido.nPedido);
         System.out.println("Preço: " + tempPedido.preco);
         System.out.println("====================================");
        }
        
    }
}
