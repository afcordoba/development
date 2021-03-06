package service;

import java.util.List;

import model.Camara;
import dao.DaoScada;

public class ScadaBWS {
	/**
     * Web service operation
     * @param nombreTabla Nombre de la Secadora a Monitorear
     * @param fecha (dd/mm/yyyy) Retorna Registros cuya fecha es >= fecha ingresada
     * @return 
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
	public List<Camara> getRegistrosPorSecadoraPorFecha(String user , String password, String nombreTabla, String fecha)  {
        DaoScada dao = DaoScada.getInstance();
        List<Camara> camaras = dao.getInformacionDeCamara(user, password, nombreTabla, fecha);
        for (Camara camara : camaras) {
            System.out.println(camara.getVarName().trim() + "," + camara.getVarValue().trim() + "," + camara.getTimeString());
        }
        return camaras;
    }
}
