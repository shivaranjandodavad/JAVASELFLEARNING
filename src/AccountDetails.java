//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class AccountDetails {
    private String name;
    private String acc;
    private String ph;
    private int bal;

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    AccountDetails(String name, String acc, String ph, int bal) {
        this.name = name;
        this.acc = acc;
        this.ph = ph;
        this.bal = bal;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc() {
        return this.acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPh() {
        return this.ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public void display() {

        System.out.println(this.name + " " + this.acc + " " + this.ph + " " + this.bal);
    }
}
