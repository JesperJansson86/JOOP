/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 10:47
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class Båt extends Fordon implements Iprintable {
    private double getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(double dödvikt) {
        this.dödvikt = dödvikt;
    }

    private double dödvikt;
    public void sväng(){
        System.out.println("Svänger");
    }
    public Båt(){}
    public Båt (double hastighet, double vikt, double dödvikt){
        super(hastighet, vikt);
        setDödvikt(dödvikt);
    }
//    public void IprintMe(){
//        System.out.println(getClass()+ " Hastighet: "+hastighet +"Vikt: "+vikt+". Antal växlar: "+getDödvikt());
//    }
    public void printMe(){
        System.out.println(getClass()+ " Hastighet: "+hastighet +"Vikt: "+vikt+". Antal växlar: "+getDödvikt());
    }
}
