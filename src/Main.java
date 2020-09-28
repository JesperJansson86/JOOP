public class Main {
    public void printViaInterface(Iprintable whatever){whatever.IprintMe();}

    public static void main(String[] args) {
        Bil bil1 = new Bil(300, 1000, 6);
        Iprintable bil2 = new Bil(200, 100, 10);
        Båt båt1 = new Båt(111, 1000, 3000);
        Iprintable båt2 = new Båt(111, 1000, 3000);
        Tåg tåg1 = new Tåg(100, 16000, 8);
        Iprintable tåg2 = new Tåg(100, 16000, 8);
        Cykel cy1 = new Cykel(30, 15, 21);
        Iprintable cy2 = new Cykel(30, 15, 21);
IHjulBuren bil3 = new Bil(300,101,4);

        bil1.printMe();
        bil2.IprintMe();
        båt1.printMe();
        båt2.IprintMe();
        tåg1.printMe();
        tåg2.IprintMe();
        cy1.printMe();
        cy2.IprintMe();

        bil1.printMe();
        bil3.IGetAntalHjul();
    }
}
