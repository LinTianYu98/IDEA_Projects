package File;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        //获取当前目录中的所有子项
        File dir = new File(".");
        /*
          Boolean isFile()   判断当前是否为一个文件
          Boolean isDirectory() 判断当前是否为一个目录
         */
        if (dir.isDirectory()){
            File[] subs= dir.listFiles();
            System.out.println(subs.length);
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
