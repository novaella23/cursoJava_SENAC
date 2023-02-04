
public class ExercicioFatorial {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
			for (int contador = num-1; contador > 0; contador --) {
				num *= contador;
				
			}
			    
			System.out.println("o fatorial de " + args[0]+ " é " + num);
	}
}
