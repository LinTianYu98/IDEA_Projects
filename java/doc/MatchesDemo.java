package doc;

/**
 * 正则表达式
 * booLean mathces(String regex)
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "facq@tedu.cn";
        /*
            邮箱的正则：[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if (match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }
}
