
public class Argumentos {

	public static void main(String[] args) {
				
		int contador = 0;
		while (contador < args.length) {
			System.out.println("argumento:" + args[contador++]);
			
		}
		contador++;
		System.out.println("número de argumentos: " + args.length);
	}
}
	


