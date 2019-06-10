package class16;

import java.io.File;

public class Demo05 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\aaa\\bbb");
        file.mkdirs();
        file = new File("D:\\aaa\\ccc");
        file.mkdir();

        File file2 = new File("d:\\aaa\\a.txt");
        System.out.println(file2.createNewFile());

    }
}
