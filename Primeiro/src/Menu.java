import java.util.Scanner;

public class Menu extends Pessoa {

		
	

	public void main(String[] args) {
		
		Pessoa gente = new Pessoa ();
		gente.setNome("Joao");
		gente.setCpf("02349801234");
		gente.setIdade(44);
				
		
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream 
	//	Scanner scn = new Scanner(System.in);
		
		while(! abrirMenu(sc).equals("3")) {
			System.out.println("Pressione Enter para continuar...");
			sc.nextLine();
		}
	}
	
	public static String abrirMenu(Scanner sc) {
		
		String opcao;
		
		
		System.out.println("Menu");
		System.out.println();
		System.out.println("1-Cadastrar pessoas");
		System.out.println("2-Listar pessoas cadastradas");
		System.out.println("3-Sair");
		System.out.println();
		System.out.println("Digite a opção desejada: ");

		opcao = sc.nextLine();
		
		
		System.out.println();
		
		switch(opcao) {
			case "1": {
				cadastrar(sc);
				break;
			}
			case "2": {
				listar();
				break;
			}
			case "3": {
				sair();
				break;
			}
			default: {
				System.out.println("Opção inválida.");
			}
			
		}
		
		return opcao;

	}


	public static void cadastrar(Scanner sc) {
		String opcaoNome;
		int opcaoIdade;
		String opcaoCpf;
		
		
		System.out.println("Digite seu nome: ");
		opcaoNome = sc.nextLine();
		
		System.out.println("Digite seu idade: ");
		opcaoIdade = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite seu cpf: ");
		opcaoCpf = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Nome: "+opcaoNome);
		System.out.println("Idade: "+opcaoIdade);
		System.out.println("CPF: "+opcaoCpf);
		
		
	}
	
	//cadastrar nome, idade, cpf
	
	public static void listar() {
		System.out.println("Listando...");
		
	}

	public static void sair() {
		System.out.println("Saindo...");
	}	
}
