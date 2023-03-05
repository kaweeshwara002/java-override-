public class Abc {
    public void man(){
        System.out.println("Amara's weight 60KG");
    }
}
class Bbc extends Abc{
    public void man(){
        System.out.println("Saman's height 5ft");
    }
    public void Man(){
        System.out.println("Kamala's sure name is Dissanayake");
    }
    public static void main(String[] args) {
        Abc a = new Abc();
        a.man();
        Bbc b1 = new Bbc();
        b1.man();
        b1.Man();

    }
}