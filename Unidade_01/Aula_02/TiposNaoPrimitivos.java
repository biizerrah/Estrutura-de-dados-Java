
public class TiposNaoPrimitivos {
    public static void main(String[] args) {
        
        //Exemplo de constate em Java
        final double PI = 3.145128;
         /*
        Quando temos um número que não será modificado no código é recomendado atribui - lo a uma constante. 
        Uma constante é identificada pela palavra reservada 'final'. Assim o valor que for atribuido a uma consoante não pode ser alterada, apenas consultada.
        */
        System.out.println(PI);

        //Cadeia de caracteres 
        String nome = "Tatiana Bezerra";
        //A String é um tipo não primitivo e junta vários caracteres, inclusive os espaços que formam palavras e frases. A atribuição deve ser feita por aspas duplas [""]
        System.out.println(nome);

        //ENUM - é um conjunto de palavras que serão usadas frequentemente e que não tem  seu valor alterado.
        enum diaSemana {

            DOMINGO,SEGUNDA_FEIRA, 
            TERÇA_FEIRA,QUARTA,QUINTA,
            SEXTA,SÁBADO
        } 

        //Não aceita aspas e nem espaços e seus valores são acessados da seguinte forma...
        diaSemana segunda = diaSemana.SEGUNDA_FEIRA;
        diaSemana domingo = diaSemana.DOMINGO; //Criar um variavel com o tipo do enum que foi criado (nesse caso diaSemana) e atribuir seu valor por meio de um ponto [.]
        System.out.println(segunda);
        System.out.println(domingo);

        //Arrays são listas de dados de um tipo definido. Diferente de variaveis os arrays conseguem armazenar mais de um dado por vez. 
        int[] numeros = {1,2,3}; //Aqui definimos uma lista do tipo inteiro. Então ela vai guardar vários números iteiros de uma vez só.

        System.out.print(numeros[0]); //Os valores são acessados por meio de indices, que começam sempre em 0.Então para acessar o 1º valor usamos numeros[0].




    }
}
