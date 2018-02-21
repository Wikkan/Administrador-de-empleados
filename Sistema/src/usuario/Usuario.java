package usuario;

public class Usuario extends Persona{
    
    private String usuario;
    private String contraseña;
    private Boolean administrador;
    
    public String getUsuario()
    {
        return this.usuario;
    }
    
    public String getContraseña()
    {
        return this.contraseña;
    }
    
    public Boolean getAdministrador()
    {
        return this.administrador;
    }
    
    public void setUsuario(String Usuario)
    {
        this.usuario = Usuario;
    }
    
    public void setContraseña(String Contraseña)
    {
        this.contraseña = Contraseña;
    }
    
    public void setAdministrador(Boolean Administrador)
    {
        this.administrador = Administrador;
    }
    

    
}
