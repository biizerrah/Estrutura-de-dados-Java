import java.util.Scanner;

public class Pessoa {

    //Atributos
    private String name;
    private int age;
    private float weight;

    //Construtor
    /* O construtor é a estrutura básica usada para a criação de uma nova instancia ou objeto. 
    Aqui podemos definir que informações pessoa terá ao ser criada. É recomendado usar o construtor, visto que se não fizermos
    o próprio java criar ele com dados padrão(0 para números e null para strings) então para evitar comportamentos inesperados no código
    é uma boa prática usar o construtor */

    public Pessoa(String name,int age,float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Metodos
    public void mostrarInfo(){
        System.out.println("===============");
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Peso: " + weight);
        System.out.println("===============");
    }

    public void niver(){
        this.age += 1;
        // ou this.age = this.age + 1;
    };
    /* This faz referencia a variavel especifica da classe. Ele diferencia os atributos da classe das variaveis dos metodos.  */

    public String getName(){
        return this.name;
    };
    
    public void setName(String name){
        this.name = name + '*';
    };

    public int getAge(){
        return this.age;
    };

    public void setAge(int age){
        this.age = age;
    };

    public static void main(String[] args){
       

        /*Pessoa pessoa = new Pessoa("Tatiana", 30, 94.0f);
        //pessoa.mostrarInfo();
        //pessoa.niver();
        pessoa.mostrarInfo();
        pessoa.setAge(36);
        pessoa.mostrarInfo();
        pessoa.setName("Ticiana");
        pessoa.mostrarInfo(); */

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
        System.out.print("Digite o seu peso: ");
        float peso = teclado.nextFloat();
        teclado.close();

        Pessoa pessoa2 = new Pessoa(nome,idade,peso);
        pessoa2.mostrarInfo();

    }
};
