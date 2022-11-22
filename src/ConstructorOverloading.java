class Calc{
    int num1;
    int num2;
    Calc(){
        num1=5;
        num2=8;

    }
    Calc(int i){
        num1=6;
    }
    Calc(int i, double d)
    {
        num1=i;
        num2=(int)d;

    }}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Calc obj =new Calc();
        System.out.println(obj.num1);
        System.out.println(obj.num2);

        Calc obj2 =new Calc(7);
        System.out.println(obj2.num1);
        System.out.println(obj2.num2);

        Calc obj3 =new Calc(11,9.5);
        System.out.println(obj3.num1);
        System.out.println(obj3.num2);

    }
}

/*
5
8
6
0
11
9
 */