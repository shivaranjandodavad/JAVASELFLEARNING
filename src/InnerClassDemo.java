class OuterClass{
    int a;
    public void show(){
        System.out.println("Inside show method");
    }
    class Inner{
        public void display(){
            System.out.println("Inside display method");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass obj=new OuterClass();
        obj.show();
        OuterClass.Inner inobj=obj.new Inner();
        inobj.display();

    }
}
