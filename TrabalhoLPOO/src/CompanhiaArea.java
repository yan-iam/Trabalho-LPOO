
public class CompanhiaArea {
	private String codCompan;
	private String nomeCompanhia;
	
	public CompanhiaArea(String codCompan, String nomeCompanhia) {
		super();
		this.codCompan = codCompan;
		this.nomeCompanhia = nomeCompanhia;
	}

	@Override
	public String toString() {
		return "CompanhiaArea [codCompan=" + codCompan + ", nomeCompanhia=" + nomeCompanhia + "]";
	}
	
	// se der errado colococar getters e setters
	
}
