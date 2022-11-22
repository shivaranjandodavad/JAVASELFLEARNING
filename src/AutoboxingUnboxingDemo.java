public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        int n1=20;
        Integer I=n1;//autoboxing primitve to object type
        int i=I;//unboxing object type to primitive type

        System.out.println("I : "+I);
        System.out.println("i : "+i);
        char ch='s';
        Character ccc=ch;
        System.out.println("ch : "+ch);
        System.out.println("CCC : "+ccc);

    }
}
