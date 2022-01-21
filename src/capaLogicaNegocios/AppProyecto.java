
package capaLogicaNegocios;

import capaGrafica.jDlgPassword;
import capaPersistencia.ArchivadorUsuario;

public class AppProyecto {

    private static Usuario usuario;
    
    public static void main(String[] args) {
        ArchivadorUsuario.llenarListaUsuarios();
        jDlgPassword jdDlgPassword=new jDlgPassword(null, true);
        jdDlgPassword.setLocationRelativeTo(null);
        jdDlgPassword.setVisible(true);
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        AppProyecto.usuario = usuario;
    }
    
}
