/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alv-c
 */
public class conexion {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    public static final String HOST = "127.0.0.1";
    public static final String PORT = "3306";
    public static final String DATABASE = "sistemaempresa";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL= "jdbc:mysql://"+ HOST + ":" + PORT + "/" + DATABASE;
    public java.sql.Connection con;
    
    public conexion() throws SQLException{
        try{
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e){
            System.out.println("Clase");
        } catch (SQLException e){
            System.out.println("SQL" + e.getMessage());
            
        }
    }
    
    
}
