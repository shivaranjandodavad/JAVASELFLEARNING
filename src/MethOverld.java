public class MethOverld {
    public static void main(String args[]){
        //method with Same name with different signature
        //signature refers to no of parameters, data type
        int length=5;
        int breadth=10;
        System.out.println("Area of the square : "+area(length));
        //different no of parameters
        System.out.println("Area of the square : "+area(length,breadth));
        double height=15;
        //different type pof data
        System.out.println("Area of Triangle : "+area(breadth,height));

    }

    public static int area(int length) {
        return length*length;
    }
    public static int area(int length,int breadth){
        return length*breadth;
    }

    public static double area(int bre,double height){
        return 0.5*bre*height;
    }
}
