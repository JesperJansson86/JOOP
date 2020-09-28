/**
 * Created by: Jesper Jansson
 * Date: 2020-09-24
 * Time: 08:54
 * Project: ObjektO_lek2
 * Copyright: MIT
 */
public interface Iprintable {

    default void IprintMe(){
        System.out.println("Skriv ut mig ");
    }
}
