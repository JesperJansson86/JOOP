package Bilfirman;

import java.util.Locale;

/**
 * Created by: Jesper Jansson
 * Date: 2020-09-24
 * Time: 09:29
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class MotorcykelAnnons extends FordonsAnnons implements IPublishable,IRevenuAble {
    private int motorKubik;
    private boolean ingårHjälm;
    private String drivtyp;

    public MotorcykelAnnons(double pris, String rubrik, String beskrivning, int yearModel, int miles, int motorKubik, boolean ingårHjälm, String drivtyp) {
        super(pris, rubrik, beskrivning, yearModel, miles);
        this.motorKubik = motorKubik;
        this.ingårHjälm = ingårHjälm;
        this.drivtyp = drivtyp;
    }

    @Override
    public void IPrintHeader() {
        System.out.println(rubrik + " " + pris + "kr");
    }

    @Override
    public void IPrintCompleteAd() {
            System.out.print(rubrik+" säljes superbilligt för "+pris+"kr Årsmodell "+yearModel+" har bara gått "+miles+"mil \nFynda nu! "+beskrivning
                    +" Motor storlek "+motorKubik+" kubik. "+drivtyp+" drivning.");
            if (ingårHjälm) System.out.print(" Hjälm ingår!");
        }

    @Override
    public void IRevenueAble() {
        System.out.println();
        System.out.printf(new Locale("EN","en"),"Vinst efter försäljning: %.2f kr",+(pris*0.75)*0.9);
    }
}


    //    public void getAnnonsText(){
//        System.out.println(rubrik+" säljes superbilligt för "+pris+" årsmodell "+yearModel+" har bara gått "+miles+"!\nFynda nu!"+beskrivning
//        +"motor storlek "+motorKubik+" det är "+drivtyp+" drivning.");
//        if (ingårHjälm) System.out.print(" Hjälm ingår!");
//    }
