package ThrowAndThrows;


public class Throws {

    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
    static void doStuff() throws InterruptedException {
        doMoreStuff();
    }

    static void doMoreStuff() throws InterruptedException {
        Thread.sleep(1000);
    }
}
