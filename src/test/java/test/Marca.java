package taller3.televisores;

public class Marca {
    private String nombre;

    public Marca(String nombre){
        this.nombre=nombre;
    }

    public void set(String nombre){
        this.nombre=nombre;
    }

    public String get(){
        return nombre;
    }
    
}