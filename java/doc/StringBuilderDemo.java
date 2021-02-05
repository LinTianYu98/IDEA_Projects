package doc;

/**
 * String的优化导致其为不变对象，这会存在利于重用但是不利于修改的操作
 * 频繁修改String会降低性能并有系统开销
 *
 * java.lang.StringBuilder是专门用于设计用来改String的API，其内部维护一个可变的char数组
 * 并且提供了各种各样修改字符串内容的方法，例如：增删改插
 * Stirng原有的相关方法：indexof，length等等
 * StringBuilder修改String内容很快，开销小
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //内部表示空字符串
        //StringBuilder builder = new StringBuilder();
        //基于给定的字符串内容进行修改
        StringBuilder builder = new StringBuilder(str);
        /*
            好好学习java，就是为了找个好工作
             好好学习java，就是为了改变世界
             replace:替换当前字符串的部分内容为指定内容
         */
        //StringBuffer线程安全   StringBuilder线程不安全
        builder.append("，就是为了找个好工作");
        str = builder.toString();
        System.out.println(str);

        builder.replace(13,18,"改变世界");
        //直接输出bulider就是输出tostring返回的字符串
        System.out.println(builder.toString());

        //删除 delete:删除当前字符串中的部分内容
        builder.delete(0,8);
        System.out.println(builder);
        /*
            insert:将给定内容插入到指定位置
         */
        builder.insert(0,"活着");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
