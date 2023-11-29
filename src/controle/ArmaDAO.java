package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Arma;
import modelo.IArmaDAO;

public class ArmaDAO implements IArmaDAO {

	private static ArrayList<Arma> inventario;
	private static ArmaDAO instancia;

	public static ArmaDAO getInstancia() {
		if (instancia == null) {
			instancia = new ArmaDAO();
			inventario = new ArrayList<>();
		}

		return instancia;
	}

	public boolean adicionarArma(Arma arma) {
		return inventario.add(arma);
	}

	public boolean editarArma(int indice, Arma novaArma) {
		return inventario.add(novaArma);
	}

	public boolean excluirArma(int indice) {
		return inventario.add(null);
	}

	public List<Arma> visualizarArmas() {
		return inventario;
	}

}
