
package conexion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Conexion {
    private String url;
    private String usuario;
    private String contraseña;
    
    public String getUrl() { return this.url; };
    public String getUsuario() { return this.usuario; };
    public String getContraseña() { return this.contraseña; };
    
    public Conexion () throws FileNotFoundException, IOException, ClassNotFoundException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("db.properties");
        props.load(in);
        in.close();

        String driver = props.getProperty("jdbc.driver");
        if (driver != null) {
            Class.forName(driver);
        }

        this.url = props.getProperty("jdbc.url");
        this.usuario = props.getProperty("jdbc.username");
        this.contraseña = props.getProperty("jdbc.password");
    }
}
