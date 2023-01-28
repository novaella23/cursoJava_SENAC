
public class TesteTipoVariavel {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(args[0]);
		
		int valor2 = Integer.parseInt(args[1]);
		
		int soma;
		
		String mensagem = "";
		
		mensagem = valor1 + "+" + valor2;
		
		soma = valor1 + valor2;
		
		mensagem += "=" + soma;
		
		System.out.println(mensagem);
		
		
	}
}
