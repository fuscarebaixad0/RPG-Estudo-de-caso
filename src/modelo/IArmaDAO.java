package modelo;

import java.util.ArrayList;
import java.util.List;

public interface IArmaDAO implements ArmaDAO {
	    static List<Arma> inventario = new ArrayList<>();

	    public void adicionarArma(Arma arma) {
	        inventario.add(arma);
	        System.out.println("Nova arma cadastrada!");
	    }

	    public void editarArma(int indice, Arma novaArma) {
	        if (indice >= 0 && indice < inventario.size()) {
	            inventario.set(indice, novaArma);
	            System.out.println("Arma editada!");
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }

	    public void excluirArma(int indice) {
	        if (indice >= 0 && indice < inventario.size()) {
	            inventario.remove(indice);
	            System.out.println("Arma excluída!");
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }

	    public List<Arma> visualizarArmas() {
	        return new ArrayList<>(inventario);
	    }
	}

