public class Saman1 {
    int height(){
        return 5;
    }
}
class Amara1 extends Saman1 {
    int height(){
        return 60;
    }
}
class Kamal1 extends Saman1 {
    String height(String x){
        return "Dissanayake";
    }
}
class Test{
    public static void main(String[] args) {
        Saman1 s = new Saman1();
        System.out.println("saman's height " + s.height()+"ft");
        Amara1 a = new Amara1();
        System.out.println("amara's weight " + a.height()+"Kg");
        Kamal1 k = new Kamal1();
        System.out.println("kamal's surename is " + k.height("Dissanayake"));
    }
}
