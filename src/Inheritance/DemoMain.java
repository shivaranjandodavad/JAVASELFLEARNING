package Inheritance;

public class DemoMain {
    public static void main(String args[]){
        Bike bike=new Bike();
//        System.out.println(bike.getHandle());
//        System.out.println(bike.getEngine());

        Bike bike1=new Bike("long","petrol+keros",2,2,5,"LED");
//        System.out.println("bike 1 has "+bike1.getHandle()+" Handle ");
//        System.out.println("bike 1 has "+bike1.getEngine());
//        System.out.println("bike 1 has "+bike1.getSeats());
//        System.out.println("bike 1 has "+bike1.getWheels());
        System.out.println(bike);
        bike.running();



    }
}


