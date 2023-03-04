
public class Carro {

	private String cor;
	private int quantidadeCombustivel;

	
	public Carro(String cor) {
		this.cor = cor;
		this.quantidadeCombustivel = 0;
	}

	public int getQtdCombustivel() {
		return this.quantidadeCombustivel;
	}
	//cor do carro
	public String getCor() {
	//	
		return this.cor;
	}
	
	
	//distancia = consumo
	//this.quantidadeCombustivel (todo combustível)
		
	public void andar(int distancia) {
		if(distancia <= this.quantidadeCombustivel) {
		this.quantidadeCombustivel -= distancia;
		System.out.println("O carro " + this.cor 
				+ " andou " + distancia);}
		else {
			System.out.println("O carro "+ this.cor + " para andar " + distancia + " tem que abastecer "+ (this.quantidadeCombustivel-distancia)*-1  + " litros");
			}
	}
	
	public void abastecer(int quantidade) {
		if(quantidade > 0 && this.quantidadeCombustivel + quantidade <= 50) {
			this.quantidadeCombustivel += quantidade;			
		} else {
			System.out.println("Só é possível abastecer com valor entre 1 e 50");
		}
		
	}
	
}