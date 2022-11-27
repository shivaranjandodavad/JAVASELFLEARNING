class Demos{
    int num1;
    int num2;
    public static void area(int i ){
        System.out.println("Area of the square = "+(i*i));

    }
    public static void area(int i ,int  b){
        System.out.println("Area of the rectangle = " +(i*b));

    }

    public static void area(int i ,float  b){
        System.out.println("Area of the triangle = "+(i*b));

    }

}


public class MethodOverloading {
    public static void main(String[] args) {
        Demos objDemo=new Demos();
        objDemo.area(5);
        objDemo.area(5,7);
        objDemo.area(5,7.8f);

    }

}
/*
Area of the square = 25
Area of the rectangle = 35
Area of the triangle = 39.0

 */