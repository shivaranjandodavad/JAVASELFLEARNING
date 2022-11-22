import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo{
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> concurrentMap=new ConcurrentHashMap<Integer,String>();
        concurrentMap.put(1,"shiv");
        concurrentMap.put(2,"Shivaranjan ");
        System.out.println(concurrentMap.get(1));
    }
}
//shiv