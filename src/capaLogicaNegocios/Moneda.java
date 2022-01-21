
package capaLogicaNegocios;

public enum Moneda {
   
    Colones,
     Dolar{
        @Override
        public String toString() {
            return "Dólar";
        }
        
    },
}
