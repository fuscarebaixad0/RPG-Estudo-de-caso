package modelo;

import java.util.ArrayList;

public interface TransporteDAO {
	void inserir(Transporte transporte);
    void atualizar(int indice, Transporte novoTransporte);
    void excluir(int indice);
    ArrayList<Transporte> listar();
}
