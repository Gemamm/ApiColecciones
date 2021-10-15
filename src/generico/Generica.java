
package generico;


public class Generica <T>{
    
    private T objeto;

    public Generica(T objeto) {
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " +objeto.getClass().getSimpleName());
        
    }    
}
