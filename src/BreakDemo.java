public class BreakDemo {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println("value is "+i);
        }
    }
}
/*
value is 0
value is 1
value is 2
value is 3
value is 4

 */