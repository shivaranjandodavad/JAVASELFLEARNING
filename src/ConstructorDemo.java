class  Demo{
    int i ;
    int j;
    int k;
    public Demo(){
        i=5;
        j=10;

    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Demo d =new Demo();
        System.out.println(d.i);
        System.out.println(d.j);
        System.out.println(d.k);
    }
}

