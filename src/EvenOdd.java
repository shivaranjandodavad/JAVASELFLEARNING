import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number to check whether number is odd or even= ");
        int num=in.nextInt();
        if (num%2==0){
            System.out.println("Even number ");
        }
        else
        {
            System.out.println("Odd Number ");
        }

        System.out.println();
    }
}
