
package capaLogicaNegocios;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String cedula;
    private String nombre;
    private String password;
    private TipoUsuario tipoUsuario;
    // static double propina=0;
    
    public Usuario() {
        
    }

    public Usuario(String cedula, String nombre, String password, TipoUsuario tipoUsuario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }
    
    
    @Override
    public String toString() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    
}
