package modelo;

import java.util.ArrayList;

public interface IndoDAO {
	void inserir(Indo indo);

	void atualizar(int indice, Indo novoIndo);

	void excluir(int indice);

	ArrayList<Indo> listar();
}
