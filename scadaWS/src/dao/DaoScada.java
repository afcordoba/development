package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import util.FileReaderConfiguration;
import model.Camara;
import exceptions.ConnectionErrorException;

public class DaoScada {

    private java.sql.Connection con = null;
    private static DaoScada connect;
    java.sql.ResultSet rs = null;
    PreparedStatement ps = null;
    static FileReaderConfiguration readerConfiguration = null;

    public static DaoScada getInstance() {
        if (connect == null) {
            connect = new DaoScada();
            readerConfiguration = new FileReaderConfiguration();
        }
        return connect;
    }

    public java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = java.sql.DriverManager.getConnection("jdbc:sqlserver://192.168.50.95:1433;databaseName=SCADA_SAP;user=sap;password=Tecno2015;");
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
            System.out.println("\nInformacion de la base de datos ");
            System.out.println("\tNombre de la base de datos: " + dm.getDatabaseProductName());
            System.out.println("\tVersion de la base de datos: " + dm.getDatabaseProductVersion());
            System.out.println("Catalogos disponibles ");
            rs = dm.getCatalogs();
            while (rs.next()) {
                System.out.println("\tcatalogo: " + rs.getString(1));
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
  
    public List<Camara> getInformacionDeCamara(String user, String password, String nombreTabla, String fecha){ 
    if(!(readerConfiguration.getUser().equals(user)) || (!readerConfiguration.getPassword().equals(password))){
        	List<Camara> messages = new ArrayList<Camara>();
        	String error = "User o Password incorrectos, verifique sus parametros";
        	Camara camara = new Camara();
            camara.setTimeString("User o Password incorrectos, verifique sus parametros");
            camara.setVarName("User o Password incorrectos, verifique sus parametros");
            camara.setVarValue("User o Password incorrectos, verifique sus parametros");
        	messages.add(camara);
        	return messages;
        }
    	
    	List<Camara> registros = new ArrayList<Camara>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
			con = this.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String query = "SELECT  VarName,TimeString ,VarValue from " + nombreTabla + " where convert(datetime,TimeString, 103) >= convert(datetime,'" + fecha + "' ,103)";
        try {
			con = this.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (con != null) {
            ps = null;
            rs = null;
            try {
				ps = con.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				rs = ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				while (rs.next()) {
				    Camara camara = new Camara();
				    camara.setTimeString(rs.getString("TimeString"));
				    camara.setVarName(rs.getString("VarName"));
				    camara.setVarValue(rs.getString("VarValue"));
				    registros.add(camara);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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

        try {
			this.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return registros;
    }

}
