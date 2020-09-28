package Bilfirman;

import java.util.Locale;

/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 11:52
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class HusvagnsAnnons extends FordonsAnnons implements IPublishable, IRevenuAble {
private int antalBäddar;
private boolean dusch;

    public HusvagnsAnnons(double pris, String rubrik, String beskrivning, int yearModel, int miles, int antalBäddar, boolean dusch) {
        super(pris, rubrik, beskrivning, yearModel, miles);
        this.antalBäddar = antalBäddar;
        this.dusch = dusch;
    }
    @Override
    public void IPrintHeader() {
        System.out.println(rubrik + " " + pris + "kr");
    }
    @Override
    public void IPrintCompleteAd() {
        System.out.print(rubrik + " säljes superbilligt för " + pris + " kr! Årsmodell " + yearModel + " har bara gått " + miles + " mil!\nFynda nu! "
                + beskrivning + " Sov ut i en utav " + antalBäddar + " tillgängliga sovplatser.");
        if (dusch) System.out.print(" Det finns dusch!");
        System.out.println();
    }
    @Override
    public void IRevenueAble(){
        System.out.printf(new Locale("EN","en"),"Vinst efter försäljning: %.2f kr",+(pris*0.75));
    }
//    public void getAnnonsText(){
//        System.out.println(rubrik+" säljes superbilligt för "+pris+" årsmodell "+yearModel+" har bara gått "
//                +miles+"!\nFynda nu!"+beskrivning+"\nSov gott i en utav "+antalBäddar+" Finnes dusch frågar du? Svaret är "+dusch);
//    }
}
