package modelo;

import java.util.ArrayList;

public interface PersonagemDAO {
	void inserir(Personagem personagem);

	void atualizar(int indice, Personagem novoPersonagem);

	void excluir(int indice);

	ArrayList<Personagem> listar();
}
