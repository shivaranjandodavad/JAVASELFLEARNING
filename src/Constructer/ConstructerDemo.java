package Constructer;

public class ConstructerDemo {
     public static void main(String[] args) {
        ConstructerClassDemo car=new ConstructerClassDemo();
         System.out.println("Car1 "+car.run()+"...");

         //constructer with parameterized
         ConstructerClassDemo car2=new ConstructerClassDemo("closed","on","seated",40);
         System.out.println("Car2 "+car2.run()+"...");


    }

}
