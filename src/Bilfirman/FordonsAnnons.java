package Bilfirman;

/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 11:42
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class FordonsAnnons {
    protected double pris;
    protected String rubrik;
    protected String beskrivning;
    protected int yearModel;
    protected int miles;
    public FordonsAnnons(){};

    public FordonsAnnons(double pris, String rubrik, String beskrivning, int yearModel, int miles) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.yearModel = yearModel;
        this.miles = miles;
    }



    public void getAnnonsText(){
        System.out.println(rubrik+" säljes superbilligt för "+pris+" årsmodell "+yearModel+" har bara gått "+miles+"!\nFynda nu!"+beskrivning);
    }
}
