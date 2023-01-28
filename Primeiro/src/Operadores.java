
public class Operadores {
	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(args[0]);
			String resposta = args[1];
			
			if(valor1 == 18 && resposta.equals("sim")){
				System.out.println("Você eh maior de idade e possui CNH");
			}
	}
}