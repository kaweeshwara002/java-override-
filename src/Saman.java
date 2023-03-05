public class Saman {
    public void Man(){
        System.out.println("Saman's height 5 ft");
    }
}
class Amara extends Saman{
    @Override
    public void Man() {
        System.out.println("Amara's weight 60 KG");
    }
}
class Kamala extends Saman{
    @Override
    public void Man() {
        System.out.println("Kamala's sure name is Dissanayake");
    }
}
class TestMethod {
    public static void main(String[] args) {
        Saman s = new Saman();
        s.Man();
        Amara a = new Amara();
        a.Man();
        Kamala k = new Kamala();
        k.Man();
    }
}

