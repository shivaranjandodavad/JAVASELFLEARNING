public class InheritanceDemoWithLogfile {
    public static void main(String[] args) {
        HttpLogFIle log=new HttpLogFIle("example.com");
        System.out.println(log.filename);
        log.writelog("index.html   - 200 ok 192.168.2.1");

    }
}
/*
Parameterized Constructor
example.com.log
example.com.log Is logfile created in /var/log/shiv   -----   index.html   - 200 ok 192.168.2.1
 */