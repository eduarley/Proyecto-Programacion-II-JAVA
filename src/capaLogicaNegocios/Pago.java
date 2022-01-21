
package capaLogicaNegocios;

import java.io.Serializable;

public class Pago implements Serializable{
    private double montoPago;
    private double montoPagado;
    private static boolean dolar;
    public Pago() {
    }
    public static String montoLetras(int valor){

        
    String[] nUnidades = {"UN", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE", "VEINTIUN", "VENTIDOS", "VEINTITRES", "VEINTICUATRO", "VEINTICINCO", "VEINTISEIS", "VEINTISIETE", "VEINTIOCHO", "VEINTINUEVE"};
    String[] nDecenas = {"DIEZ", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
    String[] nCentenas = {"CIENTO", "DOCIENTOS", "TRECIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS","SETECIENTOS","OCHOCIENTOS", "NOVECIENTOS"};
   
    String valorLetras="";
   
    int nBloque=0;
    String mostrar="";
    char []arregloCaracteresDelValor=Integer.toString(valor).toCharArray();  //hacer arreglo de caracteres del número del parámetro
    int[]arregloValores=new int[arregloCaracteresDelValor.length]; 
       for(int i=0;i<arregloValores.length;i++)       //recorre el arreglo de caracteres     
           arregloValores[arregloCaracteresDelValor.length-i-1]=Character.getNumericValue(arregloCaracteresDelValor[i]);
       int camina=0;
           while(arregloCaracteresDelValor.length-camina!=0){ //mientras el tamaño del arreglo no sea 0 restándo un contador
               int bloqueCero=0;
               int primerDigito=0;
               int segundoDigito=0;
               int tercerDigito=0;
               
               for(int i=0;i<3;i++ ){
                   
                   if(arregloValores[camina]!=0){
                   switch (i){
                       case 0:
                           valorLetras=" "+nUnidades[arregloValores[camina]-1];
                           primerDigito=arregloValores[camina];
                           break;
                       case 1:
                           if(arregloValores[camina]<=2){
                           valorLetras=" "+nUnidades[arregloValores[camina]*10+primerDigito-1];
                           }else{
                               valorLetras=" "+nDecenas[arregloValores[camina]-1]+(primerDigito!=0?" Y":"")+valorLetras;
                           }
                           segundoDigito=arregloValores[camina];
                           break;
                       case 2:
                          valorLetras=((primerDigito==0 && segundoDigito==0 && arregloValores[camina]==1)?" CIEN":nCentenas[arregloValores[camina]-1])+valorLetras; 
                           tercerDigito=arregloValores[camina];
                           break;
                   }
                   }
                   else{
                      bloqueCero++; 
                   }
                   if((++camina)>arregloValores.length-1)
                   break; 
               }
               switch(nBloque){
                   case 0:
                       mostrar=valorLetras;
                       break;
                   case 1:
                       mostrar=valorLetras+(bloqueCero==3?"":" MIL ")+mostrar;
                       break;
                   case 2:
                       mostrar=valorLetras+((primerDigito==1 && segundoDigito==0 && tercerDigito==0)?" MILLON ":" MILLONES ")+(mostrar.trim().compareTo("")==0?" DE ":"")+mostrar;
                       
               }
               nBloque++;
               
           }
           
           if(dolar){
                return mostrar+(valor>1?" DÓLARES":" DÓLAR");        
           }else{               
               return mostrar+(valor>1?" COLONES":" COLÓN");              
           }






        
    }

    
    
    
    @Override
    public String toString() {
        return "Tipo de pago:";
    }

    
    
    
    
    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public static boolean isDolar() {
        return dolar;
    }

    public static void setDolar(boolean dolar) {
        Pago.dolar = dolar;
    }

   
    
}
