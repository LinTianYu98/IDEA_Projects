package File;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个文件test.txt
        //boolean  exist()
        File file = new File("./test.txt");
        if (file.exists()){
            System.out.println("该文件已经创建过了");
        }else{
            //将File表示的文件创建出来
            file.createNewFile();
            System.out.println("文件已经创建!");
        }
    }
}
