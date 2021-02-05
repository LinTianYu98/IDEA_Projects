package doc;
/**
 * 频繁修改字符串的性能损耗
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "a";
        for (int i=0;i<100;i++){
            str += "a";
            System.out.println(str);
        }
        System.out.println("程序结束了");
    }
}
