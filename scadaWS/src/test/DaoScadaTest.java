package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Iterator;
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
		String fecha = "19/06/2015";
		List<Camara> camaras = dao.getInformacionDeCamara("sap","Tecno2015",nombreTabla,fecha);
		for (Camara camara : camaras) {
			System.out.println(camara.getVarName()+ "," + camara.getTimeString()+","+camara.getVarValue() );
		}
		assertEquals(false, camaras.isEmpty());
	}
	
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
	/*@Test
	public void should_create_camara() {
		Camara c = new Camara("Ordem_producao","01/01/1999 12:00:00","01/01/1999 12:00:00");
		assertEquals("Ordem_producao", c.getVarName());
	}*/
	
	@Test
	public void should_retrieve_secadoras_from_WS() throws ClassNotFoundException, SQLException {
		
		ScadaBWS ws = new ScadaBWS();
		assertEquals(false, ws.getRegistrosPorSecadoraPorFecha("sap","Tecno2015","Camara_1", "18/06/2015").isEmpty());
	}
	@Test
	public void should_retrieve_one_secadoras_from_WS() throws ClassNotFoundException, SQLException {
		
		ScadaBWS ws = new ScadaBWS();
		assertEquals(1, ws.getRegistrosPorSecadoraPorFecha("sap","Tecno2015","Camara_1", "21/06/2015").size());
	}
	@Test
	public void should_retrieve_error_login_to_WS() throws ClassNotFoundException, SQLException {
		
		DaoScada dao = DaoScada.getInstance();
		String nombreTabla = "Camara_1";
		String fecha = "19/06/2015";
		List<Camara> camaras = dao.getInformacionDeCamara("sap","Tecno2015",nombreTabla,fecha);
		Camara c = camaras.get(0);
		assertEquals("User o Password incorrectos, verifique sus parametros", c.getVarValue());
	}
}
