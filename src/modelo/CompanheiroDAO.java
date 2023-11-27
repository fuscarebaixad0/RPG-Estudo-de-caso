package modelo;

import java.util.ArrayList;

public interface CompanheiroDAO {

	void inserir(Companheiro companheiro);

	void atualizar(int indice, Companheiro novoCompanheiro);

	void excluir(int indice);

	ArrayList<Companheiro> listar();
}
