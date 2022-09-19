
public class PessoaFisica {
	// ATRIBUTOS

	private String nome;
	private String cpf;
	
	// CONSTRUTORES
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	// GETTERS AND SETTERS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String toLowerCase() {
		return this.nome.toLowerCase();
	}
	public int lenght() {
		return this.nome.length();
	}
	public int indexOf() {
		return this.nome.indexOf("a");
	}
}
