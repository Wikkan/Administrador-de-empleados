package login;

public class Usuario {

    private int cedula;
    private String usuario;
    private String contraseña;
    private Boolean administrador;
    
    public int getCedula()
    {
        return this.cedula;
    }
    
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
    
    public void setCedula(int Cedula)
    {
        this.cedula = Cedula;
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
