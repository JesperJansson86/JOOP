/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 10:46
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class Bil extends Fordon implements Iprintable, IHjulBuren{
    private int antalVäxlar;
    private int växelJustNu;

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        if(växelJustNu <= antalVäxlar)
            this.växelJustNu = växelJustNu;
        else System.out.println("Så mänga växlar finns inte");    }

        public Bil(double hastighet, double vikt, int antalväxlar ){
        super(hastighet,vikt);
        setAntalVäxlar(antalväxlar);

        }
public void IGetAntalHjul(){
    System.out.println("Bilen har 4 hjul");
}
public void IprintMe(){
    System.out.println(getClass()+" Hastighet: "+ hastighet+". Vikt: "+vikt+". Antal växlar: "+antalVäxlar);

}
public void printMe(){
    System.out.println(getClass()+" Hastighet: "+ hastighet+". Vikt: "+vikt+". Antal växlar: "+antalVäxlar);
}
    private void växla(int i){

        setVäxelJustNu(i);
    }
}
