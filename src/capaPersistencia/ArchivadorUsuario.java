
package capaPersistencia;

import capaLogicaNegocios.TipoUsuario;
import capaLogicaNegocios.Usuario;
import java.util.ArrayList;

public class ArchivadorUsuario {
    
    private static ArrayList<Usuario> arrayUsuarios=new ArrayList();
    
    public static void agregarUsuario(Usuario usuario){
        arrayUsuarios.add(usuario);
    }


    public static Usuario buscarUsuario(String cedula,String password){
            Usuario customer=null;
        
            for (Usuario usuario : arrayUsuarios) {
            if(usuario.getCedula().equalsIgnoreCase(cedula)&&usuario.getPassword().equals(password)){
                customer=new Usuario(usuario.getCedula(), usuario.getNombre(), usuario.getPassword(), usuario.getTipoUsuario());
            }        
        }
        return customer;
       

    }
    
    
    
    
    public static Usuario buscarUsuario(String cedula){
            Usuario customer=null;
        
            for (Usuario usuario : arrayUsuarios) {
            if(usuario.getCedula().equalsIgnoreCase(cedula)){
                customer=new Usuario(usuario.getCedula(), usuario.getNombre(), usuario.getPassword(), usuario.getTipoUsuario());
            }        
        }
        return customer;
       

    }
    
    
    
    
    public static void llenarListaUsuarios(){
        Usuario salonero1=new Usuario("207910029", "Eduardo Arley", "eduardo99", TipoUsuario.Salonero);
        Usuario salonero2=new Usuario("111111111", "José Vargas", "1234", TipoUsuario.Salonero);
        Usuario salonero3=new Usuario("222222222", "Daniela Salazar", "1234", TipoUsuario.Salonero);
        Usuario administrador1=new Usuario("123456789", "Mark Zuckerberg", "admin", TipoUsuario.Administrador);
        ArchivadorUsuario.agregarUsuario(salonero1);
        ArchivadorUsuario.agregarUsuario(salonero2);
        ArchivadorUsuario.agregarUsuario(salonero3);
        ArchivadorUsuario.agregarUsuario(administrador1);
        
        
        
    }
    
    
    
    
    
    
    
    public static String lista() {
        String h="";
        for (Usuario arrayUsuario : arrayUsuarios) {
            h+=arrayUsuario.getCedula()+" Contraseña: "+arrayUsuario.getPassword()+" //\n ";
        }
        return h;
    }

    
    
   
    
    
    
    
    public static ArrayList<Usuario> getArrayUsuarios() {
        return arrayUsuarios;
    }

    public static void setArrayUsuarios(ArrayList<Usuario> arrayUsuarios) {
        ArchivadorUsuario.arrayUsuarios = arrayUsuarios;
    }
    
}
