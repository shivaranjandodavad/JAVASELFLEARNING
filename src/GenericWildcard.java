import java.util.ArrayList;
import java.util.List;

public class GenericWildcard {
    public static void viewData(List<?> list){
        for(Object obj:list){
            System.out.println(obj);
        }
    }
    public static void integerElements(List<? super Integer> listitem){
        listitem.add(100);
    }
    public static void main(String[] args) {

        List<String> dataItems=new ArrayList<String>();
        dataItems.add("data1");
        dataItems.add("data2");
        dataItems.add("data3");
        viewData(dataItems);
        /*
        data1
        data2
        data3
         */

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        integerElements(arrayList);
        viewData(arrayList);
        //100Nav

    }
}
