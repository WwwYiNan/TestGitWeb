package class16;

import java.io.File;
import java.io.FilenameFilter;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\14 王逸楠（java）");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);

                if (currFile.isFile() && name.endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        if (file.exists()) {
            String[] lists= file.list(filter);
            for (String name:lists){
                System.out.println(name);
            }
        }

    }
}
