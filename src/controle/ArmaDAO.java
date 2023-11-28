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
		/*
		 * metodo aqui retorna
		 * verdadeiro = se conseguir inserir certinho no arraylist
		 * 
		 * retorna falso = se nao conseguir inserir no arraylist
		 */
		return inventario.add(arma);
	}

	public boolean editarArma(int indice,Arma novaArma) {
		if (indice >= 0 && indice < inventario.size()) {
			inventario.set(indice, novaArma);
			System.out.println("Arma editada!");
		} else {
			System.out.println("Índice inválido.");
		}
		return inventario.add(novaArma);
	}

	public boolean excluirArma(int indice) {
		if (indice >= 0 && indice < inventario.size()) {
			inventario.remove(indice);
			System.out.println("Arma excluída!");
		} else {
			System.out.println("Índice inválido.");
		}
		return inventario.add(null);
	}

	public List<Arma> visualizarArmas() {
		return inventario;
	}

}
