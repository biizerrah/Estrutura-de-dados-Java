public class BuscaBinaria {
    static int buscaBinaria(int[] array, int elemento){

        int inicio = 0;
        int fim = array.length - 1;
        while(inicio <= fim){
            int meio = (inicio + fim) / 2;
            if(array[meio] == elemento){
                return meio;
            } else if(array[meio] < elemento){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        return -1;
    } 
    public static void main(String[] args){

        int[] arrayBinario = {1,2,3,4,9,11,15,20};
        int numero = 6;

        int resultado = buscaBinaria(arrayBinario, numero);

        if(resultado != -1){
            System.out.print("O elemento foi encontrado no indice: " + resultado);
        }else{
            System.out.println("O elemento não foi encontrado!");
        }

    }
}
