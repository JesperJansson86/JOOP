package Bilfirman;

import java.util.Locale;

/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 11:42
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class BilAnnons extends FordonsAnnons implements IPublishable, IRevenuAble {
    protected String färg;
    protected boolean sommardäck;
    protected boolean vinterdäck;

    public BilAnnons() {
    }

    public BilAnnons(double pris, String rubrik, String beskrivning, int yearModel, int miles, String färg, boolean sommardäck, boolean vinterdäck) {
        super(pris, rubrik, beskrivning, yearModel, miles);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }


@Override
    public void IPrintHeader() {
        System.out.println(rubrik + " " + pris + "kr");
    }
@Override
    public void IPrintCompleteAd() {
        System.out.println(rubrik + " säljes superbilligt för " + pris + " kr! Årsmodell " + yearModel + " har bara gått " + miles + " mil!\nFynda nu! "
                + beskrivning + " Nylackad i " + färg+" ");
        if (sommardäck) System.out.print("Sommardäck");
        if (sommardäck&&vinterdäck) System.out.print(" och ");
        if (vinterdäck) System.out.print("Vinterdäck");
        if (vinterdäck||sommardäck) System.out.print(" finnes!");
        System.out.println();
    }
    @Override
    public void IRevenueAble(){
        System.out.printf(new Locale("EN","en"),"Vinst efter försäljning: %.2f kr",+(pris*0.75));
    }

//    public void getAnnonsText() {
//        System.out.println(rubrik + " säljes superbilligt för " + pris + " årsmodell " + yearModel + " har bara gått " + miles + "!\nFynda nu!" + beskrivning + "" +
//                "nylackad i " + färg + "sommardäck" + sommardäck + "vinterdäck" + vinterdäck);
//    }
}
