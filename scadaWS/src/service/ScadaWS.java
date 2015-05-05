/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import dao.DaoScada;
import java.sql.SQLException;
import java.util.List;
import model.Camara;

/**
 *
 * @author acordoba
 */
@WebService(serviceName = "ScadaWS")
public class ScadaWS {

    @WebMethod(operationName = "getRegistrosPorSecadoraPorFecha")
    public List<Camara> getRegistrosPorSecadoraPorFecha(@WebParam(name = "nombreTabla") String nombreTabla, @WebParam(name = "fecha") String fecha) throws ClassNotFoundException, SQLException {
        DaoScada dao = DaoScada.getInstance();
        List<Camara> camaras = dao.getInformacionDeCamara(nombreTabla, fecha);
        for (Camara camara : camaras) {
            System.out.println(camara.getVarName().trim() + "," + camara.getVarValue().trim() + "," + camara.getTimeString());
        }
        return camaras;
    }
}
