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
	public int criar(Pais pais) {
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Pais carregar(int id){
		return dao.carregar(id);
	}

	
}
