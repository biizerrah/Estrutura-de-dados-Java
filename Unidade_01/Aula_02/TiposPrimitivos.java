public class TiposPrimitivos{
    public static void main(String[] args){

        /* Tipos primitivos são tipos incorporados pela própria linguagem e representam dados simples e básicos. */

        //Números inteiros
        byte valorByte = 127; //Aceita números de -128 até 127
        short valorShort = 32767; //Aceita números de -32768 até 32767
        int valorInt = 2147483647; //Aceita valores de -2147483648 até 2147483647
        long valorLong = 9223372036854775807L;
        //Aceita valores de -9223372036854775808 até 9223372036854775807. Para ser identificado com long, deve-se escrever o 'L' depois da atribuição do valor.

        //Números flutuantes ou com casas decimais
        float valorFloat = 3.14f; //Números com poucas casas decimais e requer menos espaço na memória. Sempre precisa do 'f' depois da atribuição do valor
        double valorDouble = 3.145844111; //Números com o dobro de casas decimais que o float aceita. Toma mais espaço na memória.

        //Caracteres
        char valorChar = 'A'; //Tipo char, só aceita 1 caracter por vez que só pode ser atrbuido com aspas simples [''].

        //Boolean (Lógico)
        boolean verdadeiro = true;
        boolean falso = false;
        //O tipo boolean é um tipo lógico que só aceita true ou false e nos ajuda na tomada de decisões e estruturas de repetição

        System.out.println("Números inteiros: " + valorByte + " " + valorShort + " " + valorInt + " " + valorLong);
        System.out.println("Números flutuantes: " + valorFloat + " " + valorDouble);
        System.out.println("Caracter: " + valorChar);
        System.out.print("Boolean: " + verdadeiro + " " + falso);



    }
}