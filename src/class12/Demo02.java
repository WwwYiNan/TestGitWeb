package class12;

public class Demo02 {
    public static void main(String[] args) {
        String str = "dasjkahlflwynakjswyndhfwuwynierycvwynnxmwynlzxcjl";
        String key = "wyn";
        int count = getKeyStringCount(str, key);
        System.out.println("Count=" + count);

    }

    public static int getKeyStringCount(String str, String key) {
        int count = 0;
        if (!str.contains(key)) {
            return count;
        }
        int index = 0;
        while ((index = str.indexOf(key)) != -1) {
            str = str.substring(index + key.length());
            count++;
        }
        return count;
    }
}
