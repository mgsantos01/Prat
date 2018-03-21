package service;

import dao.PaisDAO;
import model.Pais;

public class PaisService {

	PaisDAO dao;

	public Pais maiorHabitante() {
		return dao.maiorHabitante();
	}

	public Pais menorArea() {
		return dao.menoArea();
	}

	public Pais[] paises33() {
		return dao.paises33();
	}
}
