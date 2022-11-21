public class ObjectDemo {
    public static void main(String[] args) {
        Add obj=new Add();
        obj.num1=10;
        obj.num2=20;
        obj.sum();
    }
}

class Add{
    int num1,num2,result;
    public void sum(){
        result=num1+num2;
        System.out.print("sum ="+result);
    }
}