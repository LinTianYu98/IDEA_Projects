package doc;

/**
 * String 支持正则表达式
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "sad5dsa5fds5dsf45d6d";
        //按照数字部分拆分
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        str = "123,456,789";
        //按照","拆分
        arr = str.split(",");
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //和谐用语
        String regex = "(wqnmlgb|dsb|mazz|cnml|nc|nt|sb|nmsl|fuck)";
        String message = "fuck|你就是傻逼|djb";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
