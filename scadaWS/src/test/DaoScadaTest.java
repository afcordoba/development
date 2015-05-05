package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import model.Camara;
import dao.DaoScada;
import exceptions.ConnectionErrorException;

import org.junit.Test;

import service.ScadaBWS;

public class DaoScadaTest {

	@Test
	public void should_get_camaras_to_see() throws ClassNotFoundException, SQLException {
		DaoScada dao = DaoScada.getInstance();
		String nombreTabla = "Camara_2";
		String fecha = "01/01/1999";
		List<Camara> camaras = dao.getInformacionDeCamara(nombreTabla,fecha);
		for (Camara camara : camaras) {
			System.out.println(camara.getVarName().trim()+"," + camara.getVarValue().trim()+"," + camara.getTimeString());
		}
		assertEquals(false, camaras.isEmpty());
	}
	/*@Test(expected=ConnectionErrorException.class)
	public void should_get_an_exception_when_it_cant_get_conection() throws Exception {
		DaoScada dao = DaoScada.getInstance();
		dao.getConnection();
	}*/
	@Test
	public void should_get_a_Connection() throws Exception {
		DaoScada dao = DaoScada.getInstance();
		assertEquals(true,dao.getConnection()!=null);
	}
	@Test
	public void should_display_properties() throws Exception {
		DaoScada con = DaoScada.getInstance();
		con.displayDbProperties();
	}
	@Test
	public void should_create_camara() {
		Camara c = new Camara("Ordem_producao","01/01/1999 12:00:00","01/01/1999 12:00:00");
		assertEquals("Ordem_producao", c.getVarName());
	}
	
	@Test
	public void should_retrieve_secadoras_from_WS() throws ClassNotFoundException, SQLException {
		
		ScadaBWS ws = new ScadaBWS();
		assertEquals(false, ws.getRegistrosPorSecadoraPorFecha("Camara_2", "31/12/1998").isEmpty());
	}
	@Test
	public void should_retrieve_one_secadoras_from_WS() throws ClassNotFoundException, SQLException {
		
		ScadaBWS ws = new ScadaBWS();
		assertEquals(1, ws.getRegistrosPorSecadoraPorFecha("Camara_2", "01/01/2016").size());
	}
}
