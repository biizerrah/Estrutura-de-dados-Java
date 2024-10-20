import java.util.*;

public class Espera
{
    
    private String nome;
    private int senha;
    
   public Espera(int senha, String nome){
    
     this.senha = senha;
     this.nome = nome;
   };
   
	public static void main(String[] args) {
	    
	    Queue<Espera> ordem = new LinkedList<>();
	    
	    Espera pessoa1 = new Espera(1,"Tatiana");
	    Espera pessoa2 = new Espera(2,"Ticiana");
	    Espera pessoa3 = new Espera(3,"Marize");
	    Espera pessoa4 = new Espera(4,"Van");
	    
	    ordem.offer(pessoa1);
	    ordem.offer(pessoa2);
	    ordem.offer(pessoa3);
	    ordem.offer(pessoa4);
	    
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Digite {1} para adicionar: ");
	    System.out.println("Digite {2} para exibir: ");
	    System.out.println("Digite {3} para exibir o próximo: ");
	    System.out.println("Digite {4} para sair: ");
	    boolean continuar = true;
	    
	    while(continuar){
	        
	    System.out.println("Digite sua opção: ");
		int opcao = teclado.nextInt();
		
		switch(opcao){
		    case 1:
		        System.out.println("Adicionar a senha: ");
		        int password = teclado.nextInt();
				teclado.nextLine();
		        System.out.println("Adicionar pessoa: ");
		        String name = teclado.nextLine();
		        Espera pessoas = new Espera(password, name);
		        ordem.offer(pessoas);
		        break;
		    case 2:
		        
	    for(Espera pessoa : ordem){
	        System.out.println("Nome: " + pessoa.nome + " \\Senha: " + pessoa.senha);
	    };
		        break;
		    case 3:
		        if (!ordem.isEmpty()) {
                        Espera proxima = ordem.poll();
                        System.out.println("Próxima pessoa chamada da fila : " + proxima.senha + " " + proxima.nome);
                    } else {
                        System.out.println("Fila de espera está vazia.");
                    }
		        break;
		    case 4:
		        System.out.println("SAINDO... ");
		        continuar = false;
		        break;
		    default:
		        System.out.println("OPÇÃO INVÁLIDA!");
		        break;
		}
	    }
	    
		
		
	    
	}
}

