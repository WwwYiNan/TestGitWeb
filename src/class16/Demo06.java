package class16;

import java.io.File;
import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) {
        String path = "d:\\wang\\Test";
        File file2 = new File(path);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String fileName = "abc.txt";
        File file = new File(path, fileName);
        if (!file.exists()) {
            try {

                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

