/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 10:48
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class Tåg extends Fordon implements Iprintable {
    public int getAntalvagnar() {
        return antalvagnar;
    }

    public void setAntalvagnar(int antalvagnar) {
        this.antalvagnar = antalvagnar;
    }

    private int antalvagnar;
    public void kopplavagn(int i){
         setAntalvagnar(i);
    }
    public Tåg(){}
    public Tåg(double hastighet, double vikt, int antalvagnar){
        super(hastighet, vikt);
        setAntalvagnar(antalvagnar);
    }
    public void IprintMe(){
        System.out.println(getClass()+" Hastighet: "+ hastighet+". Vikt: "+vikt+". Antal växlar: "+getAntalvagnar());
    }
    public void printMe(){
        System.out.println(getClass()+" Hastighet: "+ hastighet+". Vikt: "+vikt+". Antal växlar: "+getAntalvagnar());
    }
}
