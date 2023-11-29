package modelo;

public class Arma {
	private String nomeArma;
	private String modeloArma;
	private String forcaArma;
	private String tamanhoArma;
	private String Arma;

	public Arma(String nomeArma, String modeloArma, String tamanhoArma, String forcaArma) {
		this.nomeArma = nomeArma;
		this.modeloArma = modeloArma;
		this.forcaArma = forcaArma;
		this.tamanhoArma = tamanhoArma;
	}

	public String getArma() {
		return Arma;
	}

	public void setArma(String arma) {
		Arma = arma;
	}

	public String getModeloArma() {
		return modeloArma;
	}

	public void setModeloArma(String modeloArma) {
		this.modeloArma = modeloArma;
	}

	public String getForcaArma() {
		return forcaArma;
	}

	public void setForcaArma(String forcaArma) {
		this.forcaArma = forcaArma;
	}

	public String getTramanhoArma() {
		return tamanhoArma;
	}

	public void setTramanhoArma(String tramanhoArma) {
		this.tamanhoArma = tramanhoArma;
	}

	private String inventario;

	public String getInventario() {
		return inventario;
	}

	public void setInventario(String inventario) {
		this.inventario = inventario;
	}

	public String getNomeArma() {
		return nomeArma;
	}

	public void setNomeArma(String nomeArma) {
		this.nomeArma = nomeArma;
	}
}
