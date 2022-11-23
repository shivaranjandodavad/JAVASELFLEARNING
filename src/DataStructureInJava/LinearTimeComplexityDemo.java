package DataStructureInJava;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class LinearTimeComplexityDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        addEle(arrayList,1000000);//the time taken to iterate PT5.4054642S
        timecomplexity(arrayList);
        addEle(arrayList,2000000);//the time taken to iterate PT11.491596S
        timecomplexity(arrayList);
        addEle(arrayList,5000000);
        timecomplexity(arrayList);//the time taken to iterate PT20.2936027S
    }

    private static void addEle(List<Integer> arrayList, int length) {
        for(int i=0;i<length;i++)
            arrayList.add(i);
    }
    public static void display(ArrayList<Integer> arrayList){
        for(Integer i:arrayList)
            System.out.println(i);
    }

    private static void timecomplexity(ArrayList<Integer> arrayList) {
        Instant start=Instant.now();
        display(arrayList);
        Instant end=Instant.now();
        System.out.println("the time taken to iterate "+Duration.between(start,end));

    }
}
