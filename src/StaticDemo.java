import java.util.EnumMap;

class Employee{
    int eid;
    int salary;
    static String ceo;
    static {
        ceo="SHIV";
    }
    public void show(){
        System.out.println(eid+" : "+salary+" : "+ceo);
    }

}

public class StaticDemo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.eid=1;
        e1.salary=28000;
        Employee e2=new Employee();
        e2.eid=5;
        e2.salary=35000;
        e1.show();
        e2.show();

    }
}
