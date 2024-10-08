
import java.util.HashMap;
import java.util.Map;

public class ExemploMaps {
    public static void main(String[] args){

        //Na atribuição do Map, precisamos passar 2 atributos (Chave e Valor) mas antes devemos passar de que tipos eles serão.
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Tatiana", 32);
        mapa.put("Ticiana", 30);
        mapa.put("Marize", 56);

        System.out.println(mapa);

        System.out.println(mapa.get("Ticiana")); //GET() apenas consulta o valor que está presente na chave informada
        mapa.put("Ticiana", 32); //PUT() atualiza o valor, apenas se a chave existir
        mapa.put("Tatiana", 30);
        mapa.replace("Marize",58); //REPLACE(), altera o valor tbm
        mapa.putIfAbsent("Davi", 56);//PUTIFABSENT() adiciona um novo valor, caso a chave passada não exista no map

        System.out.println(mapa);
        
        mapa.remove("Davi");

        System.out.println(mapa);

        //Procura pela chave
        if(mapa.containsKey("Marize")){
            System.out.println("A chave existe");
        }else{
            System.out.println("A chave não existe");
        }

        //Procura pelo valor

        if(mapa.containsKey(2)){
            System.out.println("O valor  existe");
        }else{
            System.out.println("O valor não existe"); 
        }

        for(String nome : mapa.keySet()){
            System.out.println("Nome: "+ nome);
        }

        int tamanho = mapa.size();
        System.out.println("Tamanho do mapa: " + tamanho);
    }
}
