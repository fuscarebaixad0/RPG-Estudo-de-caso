package ifsc;

public class Personagem {

	private String nome;
	private String nomeCompanheiro;
	private String nomeLobo;
	private String nomeCriatura;

	int vida = 100;
	int dano = vida - 10;

	public String getNomeCompanheiro() {
		return nomeCompanheiro;
	}

	public void setNomeCompanheiro(String nomeCompanheiro) {
		this.nomeCompanheiro = nomeCompanheiro;
	}

	public String getNomeLobo() {
		return nomeLobo;
	}

	public void setNomeLobo(String nomeLobo) {
		this.nomeLobo = nomeLobo;
	}

	public String getNomeCriatura() {
		return nomeCriatura;
	}

	public void setNomeCriatura(String nomeCriatura) {
		this.nomeCriatura = nomeCriatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
