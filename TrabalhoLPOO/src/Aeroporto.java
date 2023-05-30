
public class Aeroporto {
	private String codAeroporto;
	private Endereço endereco;
	
	public Aeroporto(String codAeroporto, Endereço endereco) {
		super();
		this.codAeroporto = codAeroporto;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aeroporto [codAeroporto=" + codAeroporto + ", endereco=" + endereco.cidade + "]";
	}
	// retorna o codigo do aeroporto e a cidade 
	// se der errado, faça um construtor com getters
	
}
