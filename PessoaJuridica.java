package PfPj;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private String site;
	
	public PessoaJuridica(String nome, String telefone, String endereco, String email, 
			String cnpj, String site){
		
		super(nome, telefone, endereco, email);
		this.cnpj=cnpj;
		this.site=site;		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	
	
}
