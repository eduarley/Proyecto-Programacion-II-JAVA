
package capaPersistencia;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import capaLogicaNegocios.Cuenta;


public class CuentaBD {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir").replace("\\dist", "")+ "\\src\\Archivo\\Cuenta.txt";  //Importante poner doble slash
    private ObjectOutputStream oEscritor;
    private ObjectInputStream oLector;
    private FileInputStream archivoEntrada;
    private FileOutputStream archivoSalida;
    private ArrayList<Cuenta> arrayCuentas;
    
    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static  CuentaBD instance= null;
   
    //Constructor privado, se implementa el patrón Singleton
    private CuentaBD() {
                
    }
    
    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static CuentaBD getInstance(){
        if(instance == null){
            instance = new  CuentaBD();
        }
        return instance;
    }
    
    
    /**
     * Abre y retorna el archivo de datos, para escritura (de tipo output) al final del archivo
     * Tipo de Archivo: Secuencial.
     * Lanza la Exception al nivel donde fue llamado
     * @return void
     */
    public void abrirArchivoOutput() throws Exception {
        //Abrir el archivo
        try{
        File oArchivo = new File(RUTA_ARCHIVO);
           if(!oArchivo.exists()){
             //Abrir el archivo de Acceso Secuencial para  escritura
             //La primera vez incluye la cabecera del archivo
             //true indica que se agregarán registros al final            
             archivoSalida = new FileOutputStream(RUTA_ARCHIVO,true);
             oEscritor = new ObjectOutputStream(archivoSalida);            
           }
           else{
             //Abrir el archivo de Acceso Secuencial para  escritura
             //La primera vez incluye la cabecera del archivo
              archivoSalida = new FileOutputStream(RUTA_ARCHIVO,true);
              oEscritor = new MiObjectOutputStream(archivoSalida);
           }  
        }catch(Exception e){
            throw e;
        }        
    }

    
    public  void abrirArchivoInput() throws Exception {    
      //Abrir el archivo
      try{    
        archivoEntrada = new FileInputStream(RUTA_ARCHIVO);
        oLector = new ObjectInputStream(archivoEntrada);
      }
      catch(Exception e){
         throw e;
      }      
    }

   
    /**
     * Permite cerrar el archivo de datos que se abrió de salida
    */
    public  void cerrarArchivoOutput() throws Exception { 
        try{
          if (oEscritor != null) {
            oEscritor.close();
            oEscritor = null;
          }  
        }
        catch(Exception e){
           throw e;
        }
    }

    private void cerrarArchivoInput() throws Exception {
        try{     
             if (oLector != null) {
                oLector.close();
                oLector = null;
             }
        }
        catch(Exception e){
           throw e;
        }
    }


    /**
     * Lista de todos los Departamentos que se encuentran en el archivo
     * @return ArrayList
     */
     public ArrayList<Cuenta> listaCuentas() throws Exception{
        ArrayList listaDeptos= new ArrayList();
        //Ya que habrá bloque finally se debe encerrar el bloque try
        //el throws del encabezado lanza la excepción del finally      
      try {         
            abrirArchivoInput();
             //Si no hay más datos que leer el método available retorna cero
            while(true){
                Cuenta cuenta1 = 
                           (Cuenta)oLector.readObject();                  
                listaDeptos.add(cuenta1);
            }
         } //No se indica el catch ya que no se hará nada, solamente se lanzará por medio del throws  
        catch(Exception ex ){
            
       }
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();   
           return listaDeptos;
        } 
       
        
    }

   //Busca y retorna el objeto Departamento de acuerdo al código que recibe como 
   //parámetro, en caso de que no lo encuentre retorna null
    public Cuenta consultarCuenta(String numCuenta)throws Exception {
        Cuenta cuenta,cuentaBuscada= null ;
        
        try {
            abrirArchivoInput();
            //Si no hay más datos que leer el método available retorna cero
             while(true){
                cuenta = (Cuenta)oLector.readObject();  
                String numeroCuenta=String.valueOf(cuenta.getNumeroCuenta());
                if(numeroCuenta.equalsIgnoreCase(numCuenta)) {
                    cuentaBuscada = cuenta;
                }
             }            
        }catch(Exception e){
            
        }
        finally{ //Suceda o no suceda la excepción se deben cerrar los archivos
             cerrarArchivoInput();    
             return cuentaBuscada;
        }       
    }


    /**
     * Agregar un nuevo Departamento al final del archivo
     * @param cuenta Objeto Departamento a agregar
     * @return void
     */
    public  void agregarCuenta(Cuenta cuenta)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
              //Ejecutar la escritura del objeto pDepartamento en el archivo
               oEscritor.writeObject(cuenta);
               oEscritor.flush();  //Envía el contenido del buffer al archivo
               oEscritor.reset();//Se requiere para cuando se reciben subclases de Departamento
            }
        
        } catch (Exception e) {
            throw e;
        }
        finally{
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }
        
    }
    
    
    
    
    private void pasarArrayTemporal_Archivo() throws Exception {       
       File archivoOriginal = new File(RUTA_ARCHIVO);
       //Si hay departamentos en el ArrayList y el archivo existe
       //borra el archivo original para volverlo a llenar           
       
          if(archivoOriginal.exists()){
            archivoOriginal.delete();
          }  
          if(!arrayCuentas.isEmpty()){
             abrirArchivoOutput();
          //Pasa todos los departamentos del ArrayList al archivo
            for (Cuenta cuent : arrayCuentas) {
             oEscritor.writeObject(cuent);       
            }     
          }
          cerrarArchivoOutput();
    } 
    
    private double totalCuentas(){
        double total=0;
        for (Cuenta cuent : arrayCuentas) {
            total+=cuent.total();
        }
        return total;
    }
  
}
