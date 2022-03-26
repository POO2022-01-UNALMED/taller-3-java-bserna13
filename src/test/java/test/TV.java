package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
    }
    // TODOS LOS SET
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public void setContro(Control control){
        this.control=control;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    public void setCanal(int canal){
        this.canal=canal;
    }
    
    // TODOS LOS GET
    public Marca getMarca(){
        return marca;
    }
    public Control getControl(){
        return control;
    }
    public int getPrecio(){
        return precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    // _______________________________

    public static void contadorTVs(){
        numTV++;
    }
    public void turnOn(){
        this.estado= true;
    }
    public void turnOff(){
        this.estado=false;
    }
    public boolean getEstado(){
        return estado;
    }

    // CAMBIAR CANALES O CAMBIAR VOLUMEN EN LOS SGTES METODOS:

    public void canaUp(){
        if(estado){
            if(canal<120 && canal>1 ){
                canal++;
            }
        }
    }
    public void canaDown(){
        if(estado){
            if(canal<120 && canal>1 ){
                canal--;
            }
        }
    }
    public void volumenUp(){
        if(estado){
            if(volumen>1 && volumen<7){
                volumen++;
            }
        }
    }
    public void volumenDown(){
        if(estado){
            if(volumen>1 && volumen<7){
                volumen--;
            }
        }
    }






}
