package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dm.planesdiarios.dao.DataWarehouseDAO;

public class TestDataBase {
	DataWarehouseDAO dao = null;
	
	@Before
	public void setUp() {
		dao = DataWarehouseDAO.getInstance();
	}
	
	@Test
	public void testLogin() {
		assertEquals("DMAR", dao.getLogin("1106").getSociedad());
	}

}
