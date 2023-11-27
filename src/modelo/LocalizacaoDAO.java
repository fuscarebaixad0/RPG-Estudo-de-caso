package modelo;

import java.util.ArrayList;

public interface LocalizacaoDAO {
	void inserir(Localizacao localizacao);

	void atualizar(int indice, Localizacao novaLocalizacao);

	void excluir(int indice);

	ArrayList<Localizacao> listar();
}
