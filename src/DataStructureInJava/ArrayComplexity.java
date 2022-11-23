package DataStructureInJava;

public class ArrayComplexity {
    public static void main(String[] args) {
        int array1[]=new int[]{100};
        simpleFunc(array1);

        int array2[]=new int[]{100,200};
        simpleFunc(array2);

        int array3[]=new int[]{100,200,300};
        simpleFunc(array3);

        int array4[]=new int[]{100,200,300,400};
        simpleFunc(array4);

    }

    private static void simpleFunc(int i[]) {
        System.out.println("simple array to String "+i.toString());
        for (int j=0;j<1000;j++){
            System.out.println("Class of array object" +i.getClass());
        }
    }


}

//accesing array memory location doesnt depend on size constant time complexity O(1) over variety of input size it will behave same

//no of operation doesnt matter is this affected by inputsize   in above 1 toString+3getClass=4 O(1)