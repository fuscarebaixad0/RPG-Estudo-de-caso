package modelo;

import java.util.Scanner;

import controle.ArmaDAO;

public class Inventario {
	private static ArmaDAO armaDAO = ArmaDAO.getInstancia();

	public static ArmaDAO getArmaDAO() {
		return armaDAO;
	}

	public static void setArmaDAO(ArmaDAO armaDAO) {
		Inventario.armaDAO = armaDAO;
	}
 
}

