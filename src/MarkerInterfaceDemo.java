import java.util.ArrayList;

public class MarkerInterfaceDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("data1");
        arrayList.add("data2");
        arrayList.add("data3");
        arrayList.add("data4");
        arrayList.add("data5");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
