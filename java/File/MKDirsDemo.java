package File;

import java.io.File;

/**
 * 创建一个多级目录
 */
public class MKDirsDemo {
    public static void main(String[] args) {
        //在当前目录下新建目录 a/b/c/d/e/f
        File dir = new File("./a/b/c/d/e/f");
        if (dir.exists()){
            System.out.println("该目录已经存在");
        }else{
            /*
                与mkdir方法区别的是mkdirs会将所有不存在的父目录自动创建出来。
                而mkdir则不会，如果父目录不存在则创建不成功
             */
            dir.mkdirs();
            System.out.println("目录已经创建");
        }
    }
}
