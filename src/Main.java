import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        names = new add().run(names);
        System.out.println("Kahve " + new generate().run(names));
    }
}
