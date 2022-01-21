
package capaLogicaNegocios;

public enum Tamanio {
    Grande,
    Pequenio{
        @Override
        public String toString() {
            return "Pequeño";
        }
        
    };
}
