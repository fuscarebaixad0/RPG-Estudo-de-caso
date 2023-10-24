package ifsc;

public class Personagem {

	private String nome;

	int vida = 100;
	int dano = vida - 10;

	private String morte;
	
	public String getMorte() {
		return morte;
	}

	public void setMorte(String morte) {
		this.morte = morte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
