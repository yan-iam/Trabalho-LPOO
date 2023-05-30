
public abstract class Pessoa implements Verificavel {
	
	private String nome;
	private String cpf;
	private String rg;
	private Endereço endereco;
	private String celular;
	private String dataNascimento;
	
	
	public Pessoa(String nome, String cpf, String rg, Endereço endereco, String celular, String dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
	}
	
	public boolean validar(String CPF) { // validar
		
		return false;
	}
	
	public void solicitarNovo() {}; // validar
}
