package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import model.Pais;
import service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisDAOTest {
	Pais pais, copia;
	PaisService paisService;
	static int id = 0; 


	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais();
		pais.setId(id);
		pais.setNome("Alemanha");
		pais.setPopulacao(50000000);
		pais.setArea(25000000);
		copia = new Pais();
		copia.setId(id);
		copia.setNome("Alemanha");
		copia.setArea(25000000);
		copia.setPopulacao(50000000);
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
		
		
		
		
	}
	
	@Test
	public void test00maiorHabitante() {
		System.out.println("Maior Habitante");
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("Alemanha");
		fixture.setPopulacao(50000000);
		fixture.setArea(25000000);
		PaisService novoService = new PaisService();
		Pais novo = novoService.maiorHabitante();
		assertEquals("testa inclusao", novo, fixture);
	}
	
	@Test
	public void test01menorArea() {
		System.out.println("Menor Area");
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("Alemanha");
		fixture.setPopulacao(50000000);
		fixture.setArea(25000000);
		PaisService novoService = new PaisService();
		Pais novo = novoService.menorArea();
		assertEquals("testa inclusao", novo, fixture);
	}
	
	@Test
	public void test02paises33() {
		System.out.println("Menor Area");
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("Alemanha");
		fixture.setPopulacao(50000000);
		fixture.setArea(25000000);
		PaisService novoService = new PaisService();
		Pais novo = novoService.maiorHabitante();
		assertEquals("testa inclusao", novo, fixture);
	}
}