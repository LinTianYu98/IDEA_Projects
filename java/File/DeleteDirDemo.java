package File;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的Demo目录删除
        File file = new File("./demo");
        if (file.exists()){
            //delete（）只能删除空目录
            file.delete();
            System.out.println("目录已经删除");
        }else{
            System.out.println("目录不存在");
        }
    }
}
