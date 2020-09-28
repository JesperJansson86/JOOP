package Bilfirman;

/**
 * Created by: Jesper Jansson
 * Date: 2020-09-22
 * Time: 11:53
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public class Main {

    public static void main(String[] args) {
        BilAnnons bil1 = new BilAnnons(2566.44, "SUPERBIL","Finfin bil, väldigt fin, har förmodligen använts någon gång!",2025,200,"F05433",true,false);
        IPublishable bil2 = new BilAnnons(27000,"Mindre bra bil","Denna bil har sett sina bästa år men behöver kärlek ändå.",1911,10000000,"Mattröd?",true,true);
        HusvagnsAnnons hv1 = new HusvagnsAnnons(50000,"Flott boende på hjul!","Deluxe mega lyxhusvagn, vad mer behöver sägas?",1910,0,600,true);
        MotorcykelAnnons m1 = new MotorcykelAnnons(77000.50,"Sportmotorcykel","Snabb,lätt och lättkört MC, som hittat för den fattige studenten!",2000,2000,500,true,"Kardan");
        bil1.IPrintHeader();
        bil1.IPrintCompleteAd();
        bil1.IRevenueAble();
        bil2.IPrintHeader();
        bil2.IPrintCompleteAd();
//        bil2.IRevenueAble();
        hv1.IPrintHeader();
        hv1.IPrintCompleteAd();
        hv1.IRevenueAble();
        m1.IPrintHeader();
        m1.IPrintCompleteAd();
        m1.IRevenueAble();
    }

}
