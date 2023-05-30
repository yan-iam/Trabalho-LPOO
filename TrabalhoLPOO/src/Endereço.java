
public class Endereço {
	
	String rua;
	int numero;
	String bairro;
	String cidade;
	String cep;
	
	public Endereço(String rua, int numero, String bairro, String cidade, String cep) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public Endereço(String cidade) {
		super();
		this.cidade = cidade;
	}
	
	
	
}
