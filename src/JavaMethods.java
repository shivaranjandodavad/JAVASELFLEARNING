import java.util.Scanner;

public class JavaMethods {

    public  static void main(String args[]){
        System.out.println("natural numbers number from  1 to 100 are ");
        naturalNums();
        System.out.println("enter the range for natura numbers to print");
        Scanner in=new Scanner(System.in);
        System.out.print("Starting number for natural numbers : ");
        int startno=in.nextInt();
        System.out.print("Ending  number for natural numbers : ");
        int endno= in.nextInt();
        naturalNumsRange(startno,endno);
        oddNo(startno,endno);
        evenNo(startno,endno);

    }

    private static void evenNo(int sno, int endno) {
        System.out.println("Evem numbers between "+sno+"to  "+endno+" are :");

        for(int n=sno;n<=endno;n++) {
            if(n%2==0)
                System.out.println(n);
        }
    }

    private static void oddNo(int sno, int endno) {
        System.out.println("Odd numbers between "+sno+"to  "+endno+" are :");

        for(int n=sno;n<=endno;n++) {
            if(n%2==1)
            System.out.println(n);
        }
    }

    private static void naturalNumsRange(int sno,int endno) {
        System.out.println("Natural numbers between "+sno+"to  "+endno+" are :");

        for(int n=sno;n<=endno;n++) {
            System.out.println(n);
        }

    }

    private static void naturalNums() {
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
}
