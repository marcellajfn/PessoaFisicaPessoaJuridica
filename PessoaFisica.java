package PfPj;

public class PessoaFisica extends Pessoa{

	private String cpf; 
	private String aniversario;
	private String cargo;
		
	public PessoaFisica(String nome,String telefone, String endereco, String email, 
			String cpf, String aniversario, String cargo){
		
		super(nome, telefone, endereco,email);
		this.cpf=cpf;
		this.aniversario=aniversario;
		this.cargo=cargo;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	
	
}
