public class MysingletonDemo {
    public static void main(String[] args) {
        MySingleton mySingleton=MySingleton.getInstance();
        System.out.println(mySingleton);

        MySingleton mySingleton2=MySingleton.getInstance();
        System.out.println(mySingleton2);

    }


}
