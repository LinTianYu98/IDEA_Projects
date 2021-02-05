package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/*
    java.io.RandomAccessFile
    RAF是专门用来读写文件的类。其基于针对文件进行随机读写。
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        //想对当前目录下的raf.dat文件进行操作
        /*
            RAF常用构造器
            RandomAccessFile（File file，String mode）
            RandomAccessFile（String path，String mode）
            第一个参数为要进行读写的文件，可以传入file对象也可以
            直接给定该文件的路径
            第二个参数为操作模式，
            r：只读
            rw：读写
         */
        RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
        //向文件中写入一个字节的2进制数据
        /*
            void write(int d)
            向文件写入1个字节，写入的是给定的int值所对应的2进制的低八位
            int型正数1的二进制：
            00000000 00000000 00000000 00000001
         */
        raf.write(1);
        raf.write(2);
        raf.write(-1);
        raf.write(4);
        System.out.println("写出完毕");
        /*
            raf.dat文件数据内容
            00000001
         */
        raf.close();  //最终要调用close方法！
    }
}
