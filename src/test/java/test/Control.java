package taller3.televisores;

public class Control {
    TV tv;

    public void anlazar(TV tv){
        this.tv=tv;
        tv.setContro(this);
    }

    public void setTv(TV tv){
        this.tv=tv;
    }
    public TV getTv(){
        return tv;
    }


}
