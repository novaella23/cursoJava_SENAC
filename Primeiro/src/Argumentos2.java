
public class Argumentos2 {
	
	public static void main(String[] args) {
		
		int contador = args.length;
		while (contador >= 0) {
			System.out.println("argumento:" + args[contador]);
			contador--;
		}
				
		System.out.println("número de argumentos: " + args.length);
	}
}