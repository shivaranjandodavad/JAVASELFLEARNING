public class SampleWrapperTask {
    public static void main(String[] args) {
        System.out.println("converting primitive type to object type;");
        int num1=10;
        Integer obj=Integer.valueOf(num1);
        System.out.println("obj "+obj);

        double num2=10.909;
        Double obj2=Double.valueOf(num2);
        System.out.println("obj2 "+obj2);

        System.out.println("converting objective  type to primitive type;");
        int n1=obj.intValue();
        double n2=obj2.doubleValue();
        System.out.println(n1+"  "+n2);
    }
}
