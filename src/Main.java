public class Main {
    public static void main(String[] args){
        Computer comp = new Computer("Intel Core i5 2800", 16, 512, 2);
        comp.printInf();
        comp.powerOn(0);
        comp.powerOff(0);
        comp.powerOn(0);
        comp.powerOff(0);
    }
}
