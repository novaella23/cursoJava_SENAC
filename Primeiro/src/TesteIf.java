
public class TesteIf {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(args[0]);
		
		if(valor1 < 18) {
			System.out.println("Você eh menor de idade");
		}else if (valor1 == 18){
			System.out.println("Você acabou de virar maior de 18");
		}else {
			System.out.println("Você é maior de idade");
		}
	}
}
