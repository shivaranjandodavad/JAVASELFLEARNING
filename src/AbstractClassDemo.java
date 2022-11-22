abstract class Birds{
    abstract public void move();
}
class Penguin extends Birds{

    @Override
    public void move() {
        System.out.println("walking");
    }

}
class Ostritch extends Birds{
    @Override
    public void move() {
        System.out.println("running ");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Birds b =new Penguin();
        b.move();
        System.out.println("     ***************          ");
        Birds b2 =new Ostritch();
        b2.move();
    }
}
/*
walking
     ***************
running
 */