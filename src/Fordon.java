/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 10:44
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
abstract public class Fordon {
    public double getHastighet() {
        return hastighet;
    }

    public void setHastighet(double hastighet) {
        this.hastighet = hastighet;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    protected double hastighet;
    protected double vikt;
public Fordon (){};
public Fordon (double hastighet,double vikt){
setHastighet(hastighet);
setVikt(vikt);
}
    abstract void printMe();
    public void ändraHastighet(){
        System.out.println("BROMSA!");

    }
}

