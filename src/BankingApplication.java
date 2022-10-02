import java.util.Scanner;

public class BankingApplication {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Bank");
        while (true) {

            System.out.println("1.create new Bank Account 2:Display 3: Update balance");
            int choice = in.nextInt();

            int num;

            switch (choice) {
                case 1:
                    System.out.println("Enter No of Bank accounts need to Create =");
                    num = in.nextInt();

                    AccountDetails a[] = new AccountDetails[num];
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter " + (i + 1) + " Account name \n");
                        String name = in.next();
                        System.out.print("Enter " + (i + 1) + " Account number \n");
                        String acc = in.next();
                        System.out.print("Enter " + (i + 1) + " phone number \n");
                        String Phonenp = in.next();
                        System.out.print("Enter " + (i + 1) + " Balance \n");
                        int Balance = in.nextInt();

                        a[i] = new AccountDetails(name, acc, Phonenp, Balance);

                    }
                    break;


            }
        }

    }
}
