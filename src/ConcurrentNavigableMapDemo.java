import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentNavigableMapDemo {
    public static void main(String[] args) {
        ConcurrentNavigableMap<Integer,String > concurrentNavigableMap=new ConcurrentSkipListMap<Integer,String>();
        concurrentNavigableMap.put(1,"shiv");
        concurrentNavigableMap.put(2,"Shivaranjan");
        concurrentNavigableMap.put(3,"data2");
        concurrentNavigableMap.put(4,"data ");

        ConcurrentNavigableMap<Integer,String> concurrentNavigableMap1=concurrentNavigableMap.tailMap(2);
        System.out.println(concurrentNavigableMap1);
//{2=Shivaranjan, 3=data2, 4=data }
        ConcurrentNavigableMap<Integer,String> concurrentNavigableMap2=concurrentNavigableMap.headMap(3);
        System.out.println(concurrentNavigableMap2);
//{1=shiv, 2=Shivaranjan}
    }
}
