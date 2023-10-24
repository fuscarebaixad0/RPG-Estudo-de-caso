package ifsc;

public class Personagem {

	private String nome;

	int vida = 100;
	int dano = vida - 20;

	public void morte() {
		System.out.println("Você morreu. Mais sorte na próxima aventureito!!!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
