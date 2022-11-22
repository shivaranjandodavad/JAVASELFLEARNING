import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"Cat");
        map.put(3,"ball");
        Set set= map.entrySet();
        Iterator itr= set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();

            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println(map);
    }
}
