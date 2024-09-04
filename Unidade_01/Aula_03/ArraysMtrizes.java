public class ArraysMtrizes{
    public static void main(String[] args){

        int[] numeros = {1,2,3,4}; //Aqui criamos a variavel número do tipo array de inteiros e já iniciamos ela com um valor
        int[] numeros2 = new int[4]; //Aqui também criamos uma variavel do tipo array de inteiros, mas não colocamos nenhum valor dentro. Apenas decidimos o seu tamanho.

        numeros2[0] = 1;
        numeros2[1] = 4;
        numeros2[2] = 8;
        numeros2[3] = 12; //Agora estamos atribuindo os valores para cada posição do array. Esse é o limite 
        //numeros2[4] = 5; //Se tentarmos colocar mais um valor além do limite pré determinado, não será aceito.
        System.out.println(numeros[0]);
        System.out.print(numeros2[2]);
    }
}