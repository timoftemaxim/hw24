import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        Thread t = new Thread(() -> {
            for (String item : list) {
                System.out.println(item);
            }
        });
        t.start();
        t.join();
        Thread.sleep(1000);
    }
}