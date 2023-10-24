package ifsc;

public class Personagem {

	private String nome;

	int vida = 100;
	int dano = vida - 10;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
