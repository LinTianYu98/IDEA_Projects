package File;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        //将test.txt文件删除
        File file = new File("test.txt");
//      File file = new File("./test.txt");  相对路径"./"可以不写，默认就是从"./"开始的
        if (file.exists()){
            file.delete();
            System.out.println("文件已经删除");
        }else{
            System.out.println("该文件不存在");
        }
    }
}
