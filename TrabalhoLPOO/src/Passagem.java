
public class Passagem {
	private int numero;
	private Voo VooIda;
	private Voo VooVolta;
	private Passageiro passageiro ;
	private String assento;
	
	public Passagem(int numero, Voo voolda, Voo vooVolta, Passageiro passageiro, String assento) {
		super();
		this.numero = numero;
		VooIda = VooIda;
		VooVolta = vooVolta;
		this.passageiro = passageiro;
		this.assento = assento;
	}

	public Passagem(int numero, Voo voolda, Passageiro passageiro, String assento) {
		super();
		this.numero = numero;
		VooIda = VooIda;
		this.passageiro = passageiro;
		this.assento = assento;
	}
	
	public boolean VerificarCapacidade() { // nao to com cabeca agora aaaaaaaaaaaa 
		return false;						// NAO ESQUECER O toSTring
	}
}
