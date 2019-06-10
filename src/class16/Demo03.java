package class16;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File file = new File("D:\\dqj");
        deleteDir(file);
    }

    public static void deleteDir(File dir) {
        if (dir.exists()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDir(file);
                } else {
                    file.delete();
                }
            }
            dir.delete();
        }
    }
}
