import java.util.Scanner;

public class Mennu {
	
}
	public static void main(String[] args) {
	
		
		System.out.println("         M E N U");
		System.out.println();
		System.out.println("=============================");
		
		System.out.println("1 - Cadastrar pessoas");
		String cadastrar = "1";
		
		System.out.println("2 - Listar pessoas cadastradas");
		String listar = "2";
		
		System.out.println("3 - Sair");
		String sair = "3";
		
		System.out.println("=============================");
		System.out.println("Digite a opção desejada ==>");
		
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		