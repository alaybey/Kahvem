import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class add {
    ArrayList<String> run(ArrayList<String> names) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/names.txt"));
            while (s.hasNext()){
                names.add(s.next());
            }
        return names;
    }
}
