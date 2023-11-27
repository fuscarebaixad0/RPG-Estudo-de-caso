package modelo;

import java.util.ArrayList;

public interface ArmaDAO {
	void inserir(Arma arma);

	void editar(int indice, Arma novaArma);

	void excluir(int indice);

	void adicionar(Arma novaArma);

	void visualizar();

	ArrayList<Arma> listar();

	void editarArma(int i, Arma novaArma);

}
