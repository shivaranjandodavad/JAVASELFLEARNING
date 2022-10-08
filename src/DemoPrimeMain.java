import java.util.Scanner;

public class DemoPrimeMain {
    public static void main(String args[]){

        Scanner in =new Scanner(System.in);
        System.out.print("Enter the no to check given no is prime ");
        int num=in.nextInt();
        PrimeLogic p=new PrimeLogic();

        if(p.isPrime(num)){
            System.out.print("The number is prime");
        }
        else {
            System.out.print("The number is not of prime");
        }
    }
}
