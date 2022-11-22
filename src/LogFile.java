public class LogFile {
    String filename="logfile.log";
    String filepath="/var/log/";

    LogFile(){
        System.out.print("Default Constructor");
    }
    LogFile(String filename,String filepath){
        System.out.println("Parameterized Constructor");
        this.filename=filename;
        this.filepath=filepath;

    }
    public void writelog(String line){
        System.out.println(filename+" Is logfile created in "+filepath+"   -----   "+line);

    }
}
