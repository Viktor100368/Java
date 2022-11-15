package Shild.Glava_9;

public class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client();
        Client cc = new Client();
        c.callback(42);
        cc.meth();
    }
}
