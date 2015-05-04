package service;

import dao.DaoScada;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import model.Camara;

/*
 **
 **
 */
public class ScadaService implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
     ** El metodo getRegistrosPorSecadoraPorFecha tiene 2 parametros de ingreso
     ** nombreTabla representa la secadora a ser monitoreada, consultada.
     ** fecha representa la fecha a tener en cuenta para recuperar todos los registros
     ** Los registros a retornar deben ser mayor o igual a esa  fecha 
     ** cuyo formato debe ser dd/mm/yyyy ejemplo (01/05/2015)
     ** Si ningun registro cumple la condicion se retornara null 
     */

    public List<Camara> getRegistrosPorSecadoraPorFecha(String nombreTabla, String fecha) throws ClassNotFoundException, SQLException {
        DaoScada dao = DaoScada.getInstance();
        List<Camara> camaras = dao.getInformacionDeCamara(nombreTabla, fecha);
        for (Camara camara : camaras) {
            System.out.println(camara.getVarName().trim() + "," + camara.getVarValue().trim() + "," + camara.getTimeString());
        }
        return camaras;
    }
}
