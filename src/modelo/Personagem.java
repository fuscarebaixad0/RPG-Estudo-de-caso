package modelo;

public class Personagem {

	private String nome;
	private Transporte meioTransporte;
	private String escolhaArma;
	private String arma;
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	int vida = 100;

	public String getEscolhaArma() {
		return escolhaArma;
	}

	public void setEscolhaArma(String escolhaArma) {
		this.escolhaArma = escolhaArma;
	}

	int dano = vida - 20;

	public Transporte getMeioTransporte() {
		return meioTransporte;
	}

	public void setMeioTransporte(Transporte meioTransporte) {
		this.meioTransporte = meioTransporte;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
