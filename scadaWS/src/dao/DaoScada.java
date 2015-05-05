package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.Camara;
import exceptions.ConnectionErrorException;

public class DaoScada {

    private java.sql.Connection con = null;
    private static DaoScada connect;
    java.sql.ResultSet rs = null;
    PreparedStatement ps = null;

    public static DaoScada getInstance() {
        if (connect == null) {
            connect = new DaoScada();
        }
        return connect;
    }

    public java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SCADA_SAP;user=sap;password=Tecno2015;");
        } else {
            new ConnectionErrorException();
        }

        return con;
    }

    public void displayDbProperties() throws ClassNotFoundException, SQLException {
        java.sql.DatabaseMetaData dm = null;
        con = this.getConnection();
        if (con != null) {
            dm = con.getMetaData();
            System.out.println("Informacion del controlador");
            System.out.println("Nombre del controlador: " + dm.getDriverName());
            System.out.println("Version del controlador: " + dm.getDriverVersion());
            System.out.println("\nInformaci�n de la base de datos ");
            System.out.println("\tNombre de la base de datos: " + dm.getDatabaseProductName());
            System.out.println("\tVersi�n de la base de datos: " + dm.getDatabaseProductVersion());
            System.out.println("Catalogos disponibles ");
            rs = dm.getCatalogs();
            while (rs.next()) {
                System.out.println("\tcat�logo: " + rs.getString(1));
            }
            closeConnection();
        }
        dm = null;
    }

    private void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
            rs = null;
        } else {
            new ConnectionErrorException();
        }
        if (con != null) {
            con.close();
            con = null;
        } else {
            new ConnectionErrorException();
        }

    }

    public List<Camara> getInformacionDeCamara(String nombreTabla, String fecha) throws ClassNotFoundException, SQLException {
        List<Camara> registros = new ArrayList<Camara>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        con = this.getConnection();
        String query = "SELECT  VarName,TimeString ,VarValue from " + nombreTabla + " where convert(datetime,TimeString, 103) >= convert(datetime,'" + fecha + "' ,103)";
        con = this.getConnection();
        if (con != null) {
            ps = null;
            rs = null;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Camara camara = new Camara();
                camara.setTimeString(rs.getString("TimeString"));
                camara.setVarName(rs.getString("VarName"));
                camara.setVarValue(rs.getString("VarValue"));
                registros.add(camara);
            }
            if(registros.size()== 0){
            	Camara camara = new Camara();
                camara.setTimeString("No hay registro en esa fecha");
                camara.setVarName("No hay registro en esa fecha");
                camara.setVarValue("No hay registro en esa fecha");
                registros.add(camara);

            }
        } else {
        	new ConnectionErrorException();
        }

        this.closeConnection();
        return registros;
    }

}
