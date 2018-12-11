import java.io.FileNotFoundException;
import java.util.ArrayList;

public static final String COFFEE ="Kahve ";

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        Add add = new Add();
        names = add().run(names); 
        System.out.println(COFFEE + new generate().run(names));
    }
}
