package interfacesthreads;

public class InterfacesMain {
    public static void main(String[] args) {
        new Thread(() -> System.out.printf("hello thread")).start();
    }
}
