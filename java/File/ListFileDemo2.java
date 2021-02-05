package File;

import java.io.File;
import java.io.FileFilter;

/**
 * * 获取一个目录中满足指定条件的所有子项
 *  *  File[] ListFiles(FileFilter filter)
 *  *  将当前File对象表示的目录中所有符合给定过滤器要求的子项返回
 *  *  该方法会将该目录中所有的子项都经过一次给定的过滤器，然后仅保留
 *  *  并返回符合要求的子项
 *  *
 */
 public class ListFileDemo2 {
    public static void main(String[] args) {
        /*
            获取当前目录所有名字中含有“e”的子项
         */
        File dir = new File(".");
        if (dir.isDirectory()){
            //MyFilter filter = new MyFilter();
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("e");
                }
            };/*
                重载的ListFiles方法会将dir中每个子项都经过一次
                给定的过滤器的accept方法，并最终返回所有返回为true的子项
            */
            File[] subs = dir.listFiles(filter);
            System.out.println("子项个数:"+subs.length);
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
 }

/**
 *
 */

//class  MyFilter implements FileFilter{
    /**
     * 该方法的作用就是定义参数file是否符合要求，符合返回true
     * @param file
     * @return
     */
   // public boolean accept(File file) {
        //凡是名字中含有“e”的就接受
    //    String name = file.getName();
        //int index = name.indexOf("e");
        //  return index!=-1;
        //判断name中是否含有"e"
      //  boolean contains = name.contains("e");
      //  return contains;

  //  }
//}