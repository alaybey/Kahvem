import java.util.ArrayList;
import java.util.Random;

class generate {
    String run(ArrayList<String> names) {
       return (names.get(new Random().nextInt(names.size())));
    }
}
