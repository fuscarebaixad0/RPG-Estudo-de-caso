package modelo;

import java.util.ArrayList;

public interface InteracaoDAO {
	void inserir(Interacao interacao);

	void atualizar(int indice, Interacao novaInteracao);

	void excluir(int indice);

	ArrayList<Interacao> listar();
}
