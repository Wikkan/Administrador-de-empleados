
package conexion;
import java.sql.*;

public class Conexion {
    private String url = "jdbc:mysql://localhost:3306/sistemaempresa?autoReconnect=true&useSSL=false";
    private String usuario = "root";
    private String contraseña = "";
    
    public String getUrl() { return this.url; };
    public String getUsuario() { return this.usuario; };
    public String getContraseña() { return this.contraseña; };
    
    public Conexion () {}
}
