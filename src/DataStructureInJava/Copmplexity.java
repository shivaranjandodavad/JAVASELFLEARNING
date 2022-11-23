package DataStructureInJava;

public class Copmplexity {
    public static void main(String[] args) {
        simpleFunc(10,20,30);
        simpleFunc(2,3,3);
    }

    private static void simpleFunc(int i, int i1, int i2) {
        int sum=i+i1;
        int product=i*i1*i2;
        int quotient=i1*i2/i;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);

    }
}
//1sum+2multiply+1multiplym+1divide+3prints=8 O(1) based upon input size no of operation remains constant  constant time complexity
