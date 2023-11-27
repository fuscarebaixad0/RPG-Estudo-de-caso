package modelo;

import java.util.ArrayList;

public interface NPCDAO {

	void inserir(NPC npc);

	void atualizar(int indice, NPC novoNPC);

	void excluir(int indice);

	ArrayList<NPC> listar();
}
