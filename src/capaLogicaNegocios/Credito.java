
package capaLogicaNegocios;

import java.io.Serializable;

public class Credito extends Pago implements Serializable{
    private TipoTarjeta tipoTarjeta;
    private String numeroTarjeta;

    public Credito() {
    }
    public double descuento(){
        if(tipoTarjeta==TipoTarjeta.VISA){
            return getMontoPago()*0.25;
        }else{
            return 0;
        }
        
    }
    public double montoFinal(){
        return getMontoPago()-descuento();
    }

    
    public static boolean VerificacioTarjeta(String numeroTarjeta) {
        if (numeroTarjeta == null)
            return false;
        char revisaDigito = numeroTarjeta.charAt(numeroTarjeta.length() - 1);
        String digit = OperacionVerificacion(numeroTarjeta.substring(0, numeroTarjeta.length() - 1));
        return revisaDigito == digit.charAt(0);
    }
    
    public static String OperacionVerificacion(String numeroTarjeta) {
        if (numeroTarjeta == null)
            return null;
        String digito;
        /* convierte en un arreglo para más facil */
        int[] arregloDigitos = new int[numeroTarjeta.length()];
        for (int i = 0; i < numeroTarjeta.length(); i++) {
            arregloDigitos[i] = Character.getNumericValue(numeroTarjeta.charAt(i));
        }
        

        /* doble cada otro comenzando desde la derecha - saltando de 2 en 2 */
        for (int i = arregloDigitos.length - 1; i >= 0; i -= 2)	{
            arregloDigitos[i] += arregloDigitos[i];
            
            /* tomando la suma de dígitos mayores que 10 - restando 9 */
            if (arregloDigitos[i] >= 10) {
                arregloDigitos[i] = arregloDigitos[i] - 9;
            }
        }
        int sum = 0;
        for (int i = 0; i < arregloDigitos.length; i++) {
            sum += arregloDigitos[i];
        }
        /* multiplicar por */
        sum = sum * 9;
        
        /* Convertir a cadena para que sea más fácil tomar el último dígito. */
        digito = sum + "";
        return digito.substring(digito.length() - 1);
    }
    
    
    
    
    @Override
    public String toString() {
        return "Crédito";
    }

    
    
    
    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }


    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
}
