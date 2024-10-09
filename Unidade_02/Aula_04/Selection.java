public class Selection{

    public static void SelectionSort(int[] array){
        /* Esse algoritmo de ordenação sempre leva em consideração o MENOR valor do array. Então é preciso encontar o menor valor e compara - lo com
         os demais valores do array e sempre que o valor de comparação for MENOR que o valor atual do array a troca deles acontece. Ordenando assim o array.
         */
        int tamanho = array.length;
        for(int i=0; i < tamanho; i++ ){
            int min = i; //Define um elemento inicial do array para ser comparado.
            for(int j = i + 1; j < tamanho; j++){ // compara a posição atual do array(array[i]) com a seguinte (array[j]).
                if(array[j] < array[min]){
                    min = j; 
                    /*Se a posição atual(array[j]) for MENOR que a posição setada como
                     comparção(array[min]), atualizamos o valor ds última para sempre ter o menor valor nela*/
                }
            }

            int temp = array[min]; //Criamos uma variavel temporaria para ajudar na troca de valores. Aqui ela recebe o menor valor do array
            array[min] = array[i]; //Com o valor dessa variavel(array[min]) já salva em outra variavel, atualizamos o valor dela com o valor da variavel(array[i]) que é o valor atual.
            array[i] = temp;

        }
    }
    public static void main(String[] args) {
        
        int[] array = {10,5,8,6,12,1,2};

        for (int item : array) {
           System.out.print(item + " "); 
        }
        
        SelectionSort(array);

        System.out.println("\n=================");

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}