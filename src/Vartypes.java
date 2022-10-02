public class Vartypes {
    static int m = 100;//static

    public static void main(String[] args) {
        int a = 10;//instance variables
        meth();

    }

    public static void meth() {
        int n1 = 10;//local variable
        int sum = n1 + m;
        System.out.print(sum);
    }
}
