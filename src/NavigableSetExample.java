import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet=new TreeSet<String>();
        navigableSet.add("data1");
        navigableSet.add("data3");
        navigableSet.add("data2");

        navigableSet.add("10");
        navigableSet.add("3");
        navigableSet.add("300");
        System.out.println(navigableSet);
        NavigableSet<String> reverseNavigableset=navigableSet.descendingSet();
        System.out.println(reverseNavigableset);

    }
}
/*
"C:\Program Files\Java\jdk-16.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.2\lib\idea_rt.jar=62011:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Shivaranjan Dodavad\IdeaProjects\JAVA SELF LEARNING\out\production\JAVA SELF LEARNING" NavigableSetExample
[10, 3, 300, data1, data2, data3]
[data3, data2, data1, 300, 3, 10]
 */