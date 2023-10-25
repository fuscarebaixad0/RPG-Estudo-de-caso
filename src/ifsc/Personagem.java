package ifsc;

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

	public void morte() {
		System.out.println("Você morreu. Mais sorte na próxima aventureito!!!");
	}

	public void exausto() {
		System.out.println("Você ficou exausto e não tinha muitos suprimentos.");
	}

	public static void chegou() {
		System.out.println("Chegou sem problemas.");
	}

	public static void opinv() {
		System.out.println("Opção inválida. Escolha novamente.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
