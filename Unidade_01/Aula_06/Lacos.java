public class Lacos{
    public static void main(String[] args){

        //Laço for: Usado para iterar sobre listas onde sabemos o tamanho especifico ou quando sabemos exatamente a quantidade de vezes que queremos a repetição.
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        };

        //Laço while: Usamos quando não sabemos a quantidade de vezes que haverá a iteração. Mas precisamos garantir uma condição de parada.
        //Aqui o código não roda nem uma vez, caso encontre um erro na condição inicial, primeiro há uma verifcação de conformidade e depois ele roda.
        System.out.println("==========");
        int contador = 1;
        while(contador <= 5){
            System.out.println(contador);
            contador++;
        };

        //Laço Do While: Aqui a diferença é que o código roda primeiro e depois ele verifica a conformidade.
        //Usado para código que queremos intencionalmente que rode, pelo menos uma vez mas não sabemos ao certo quantas vezes ele precisará ser repitido.
        System.out.println("==========");
        int j = 5;
        do { 
          System.out.println(j);
          j++;  
        } while (j <=5);
    };
};