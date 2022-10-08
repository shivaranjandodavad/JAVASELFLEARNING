package DefaultConstructerDemo;

public class Demo {
    public static void main(String args[]){

        //default constructer constructer without having statement automaticallly consturcted
        //if we are initiallized constructer then default constructer will not be crated
        Smartphone smartphone=new Smartphone();
       System.out.println(smartphone.getBrand());

    }
}
