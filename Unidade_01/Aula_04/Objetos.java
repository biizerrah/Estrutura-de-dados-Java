public class Objetos{

    //Atributos
    private final String name;
    private final int age;
    private final float weight;

    //Construtor
    public Objetos(String name,int age,float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Metodos
    public void mostrarInfo(){
        System.out.println("===============");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Peso: " + weight);
        System.out.println("===============");
    }
    public static void main(String[] args){

        //Declarando um novo objeto
        Objetos pessoa1 = new Objetos("Tatiana", 30, 94.5f);
        Objetos pessoa2 = new Objetos("Ticiana", 32, 87.5f);
        Objetos pessoa3 = new Objetos("Marize", 58, 52.0f);

        pessoa1.mostrarInfo();
        pessoa2.mostrarInfo();
        pessoa3.mostrarInfo();
    }
}