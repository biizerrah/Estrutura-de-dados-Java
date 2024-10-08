
public class Pessoa2{
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private float imc;

    public Pessoa2(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    };

    public void maiorIdade(){

        if (this.idade <= 18) {
            System.out.println("Menor de idade!");
        }else{
            System.out.println("Maior de idade!");
        };
    };

    public float IMC(){

        imc = (this.peso * this.peso) / this.altura;
        if (imc < 18.5) {
            System.out.print("O IMC com o valor " + imc + " é classificado como: Magreza.");
        }else if(imc == 18.5 && imc <= 24.9){
            System.out.print("O IMC com o valor " + imc + " é classificado como: Normal.");
        }else if (imc == 25.0 && imc <= 29.9) {
            System.out.print("O IMC com o valor " + imc + " é classificado como: Sobrepeso..");
        }else if(imc == 30.0 && imc <= 39.9){
            System.out.print("O IMC com o valor " + imc + " é classificado como: Obesidade II.");
        }else{
            System.out.print("O IMC com o valor " + imc + " é classificado como: Obesidade III."); 
        }
        return imc;
    };
    public static void main(String[] args){

    Pessoa2 pessoa = new Pessoa2("Tatiana", 30,65f,1.65f);
    pessoa.maiorIdade();
    pessoa.IMC();
    };
};