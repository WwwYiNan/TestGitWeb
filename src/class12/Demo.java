package class12;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Demo {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("abcd");
        char[] charArray = new char[]{'D', 'E', 'F'};
        String str3 = new String(charArray);
        System.out.println("a" + str1 + "b");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("————————————————————————————————");
        String s = "abcdeabcdefababab";
        System.out.println("字符串的长度为：" + s.length());
        System.out.println("字符串中第一个字符：" + s.charAt(0));
        System.out.println("字符串中第二个字符：" + s.charAt(1));
        System.out.println("字符c第一次出现的位置 " + s.indexOf('c'));
        System.out.println("字符c最后一次出现的位置 " + s.lastIndexOf('c'));
        System.out.println("字符串ab第一次出现的位置 " + s.indexOf("ab"));
        System.out.println("字符串ab最后一次出现的位置 " + s.lastIndexOf("c"));
        System.out.println("————————————————————————————————");
        String str = "abcd";
        System.out.print("将字符串转为字符数组后的结果：");
        char[] charArry1 = str.toCharArray();
        for (int i = 0; i < charArry1.length; i++) {
            if (i != charArry1.length - 1) {
                System.out.println(charArry1[i] + ",");
            } else {
                System.out.println(charArry1[i]);
            }
        }
        System.out.println("将int值转换为String类型后的结果：" + String.valueOf(12));
        System.out.println("将字符串转换成大写之后的结果：" + str.toUpperCase());
        System.out.println("————————————————————————————————");
        String ss = "itcast";
        System.out.println("将it替换成cn.it的结果：" + ss.replace("it", "cn.it"));
        String ss1 = "     i t c a s t     ";
        System.out.println(ss1.trim());
        System.out.println("去掉所有空格后的结果：" + ss1.replace(" ", ""));
        System.out.println("————————————————————————————————");
        String ss2 = "String";
        String ss3 = "Str";
        String ss4 = "Str";
        System.out.println("判断是否以字符串Str开头："+ss2.startsWith("Str"));
        System.out.println("判断是否以字符串ng开头："+ss2.endsWith("ng"));
        System.out.println("判断是否字符串是否为空："+ss2.isEmpty());
    }
}
