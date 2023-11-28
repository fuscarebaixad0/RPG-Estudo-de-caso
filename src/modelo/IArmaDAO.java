package modelo;

import java.util.List;

public interface IArmaDAO {

	public boolean adicionarArma(Arma arma);

	public boolean editarArma(int indice, Arma novaArma);

	public boolean excluirArma(int indice);

	public List<Arma> visualizarArmas();

}
