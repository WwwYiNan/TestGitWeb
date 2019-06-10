package class16;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("D:\\14 王逸楠（java）");
        if (file.isDirectory()){
            String[] names = file.list();
            for (String name:names){
                System.out.println(name);
            }
        }
    }
}
