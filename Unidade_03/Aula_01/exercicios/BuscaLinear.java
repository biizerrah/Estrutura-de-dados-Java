public class BuscaLinear {

    static int buscaLinear(int[] array, int elemento){
        for(int i = 0; i < array.length; i++){
            if(array[i] == elemento){
                return i;
            } 
        }

        return -1;
    }
    public static void main(String[] args){

        int[] lista = {1,2,5,10,9,65};
        int num = 3;

       System.out.print(buscaLinear(lista,num));
     
    }
}
