public class ContinueStatementDemo {
    public static void main(String[] args) {
        int num=6;
        System.out.println("Skip the number "+num);
        for(int i=0;i<=10;i++){
            if(num==i){
                continue;
            }
            System.out.println("Value ="+i);
        }

    }
}
/*
Skip the number 6
Value =0
Value =1
Value =2
Value =3
Value =4
Value =5
Value =7
Value =8
Value =9
Value =10

 */