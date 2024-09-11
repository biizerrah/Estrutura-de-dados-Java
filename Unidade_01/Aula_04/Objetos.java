public class Objetos{

    //Atributos
    private String name;
    private int age;
    private float weight;

    //Construtor
    public Objetos(String name,int age,float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Metodos
    public void mostrarInfo(){

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Peso: " + weight);
    }
    public void main(String[] args){

        //Declarando um novo objeto
        Objetos pessoa1 = new Objetos("Tatiana", 30, 94.5f);
        Objetos pessoa2 = new Objetos("Ticiana", 32, 87.5f);

        pessoa1.mostrarInfo();
        pessoa2.mostrarInfo();
    }
}