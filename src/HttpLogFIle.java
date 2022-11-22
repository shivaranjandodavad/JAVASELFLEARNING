public class HttpLogFIle extends LogFile{
    String sitename;
    public HttpLogFIle(String sitename){
        super(sitename+".log","/var/log/shiv");
    }
}
