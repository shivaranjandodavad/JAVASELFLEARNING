

class Bird{
    public void display(){
        System.out.println("flying");
    }

}
class penguin extends Bird{
    public void display(){
        System.out.println("walking");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Bird p=new penguin();
        p.display();
    }
}
