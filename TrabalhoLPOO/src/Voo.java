import java.util.Calendar;

public class Voo {

	private String NumVoo;
	private Aeroporto origem;
	private Aeroporto destino;
	private Calendar dataHoraOrigem;
	private Calendar dataHoraDestino;
	private int capacidade;
	
	public Voo(String numVoo, Aeroporto origem, Aeroporto destino, Calendar dataHoraOrigem, Calendar dataHoraDestino,
			int capacidade) {
		super();
		NumVoo = numVoo;
		this.origem = origem;
		this.destino = destino;
		this.dataHoraOrigem = dataHoraOrigem;
		this.dataHoraDestino = dataHoraDestino;
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Voo [NumVoo=" + NumVoo + ", origem=" + origem + ", destino=" + destino + ", dataHoraOrigem="
				+ dataHoraOrigem + ", dataHoraDestino=" + dataHoraDestino + ", capacidade=" + capacidade + "]";
	}
	
	// se der errado, faça um construtor com getters
	
}
