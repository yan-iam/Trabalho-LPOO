
public class Passageiro extends Pessoa {
	
	int numPassaporte;

	
	public Passageiro(String nome, String cpf, String rg, Endereço endereco, String celular, String dataNascimento,
			int numPassaporte) {
		super(nome, cpf, rg, endereco, celular, dataNascimento);
		this.numPassaporte = numPassaporte;
	}



	@Override
	public String toString() {
		return "Passageiro [numPassaporte=" + numPassaporte + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	}


