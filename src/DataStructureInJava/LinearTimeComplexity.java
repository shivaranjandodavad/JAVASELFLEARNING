package DataStructureInJava;

public class LinearTimeComplexity {

    public static void main(String[] args) {
        int array1[]=new int[]{10};
        simpFunc(array1);

        int array2[]=new int[]{10,20,30};
        simpFunc(array2);

        int array3[]=new int[]{10,50,70,80,90,120};
        simpFunc(array3);
    }

    private static void simpFunc(int[] arr) {
        System.out.println("*************");
        for(int i=0;i<arr.length;i++){
            System.out.println("The Square of a number "+arr[i]+" is "+(arr[i]*arr[i]));
        }

    }
}
// no of operation will vary on input size linear time complexity Big O(N)