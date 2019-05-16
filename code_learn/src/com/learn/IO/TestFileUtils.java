package com.learn.IO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class TestFileUtils {
    public static void main(String[] args) throws IOException {

        //文件大下
        long l = FileUtils.sizeOf(new File("/home/chyao/桌面/1.txt"));
        System.out.println(l);

        //子孙集
//        Collection<File> files = FileUtils.listFiles(new File("/home/chyao/桌面"), EmptyFileFilter.NOT_EMPTY, null);
//        for(File file:files){
//            System.out.println(file.getName());
//        }

//        Collection<File> files = FileUtils.listFiles(new File("/home/chyao/桌面"),
//        EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);

//        Collection<File> files = FileUtils.listFiles(new File("/home/chyao/桌面"), FileFilterUtils.or(new SuffixFileFilter("java"),new SuffixFileFilter("class")),
//                DirectoryFileFilter.INSTANCE);

        //读取文件

        String s = FileUtils.readFileToString(new File("/home/chyao/桌面/1.txt"), "UTF-8");
        System.out.println(s);


        List<String> strings = FileUtils.readLines(new File("/home/chyao/桌面/1.txt"), "UTF-8");
        for(String line:strings){
            System.out.println(line);
        }

        LineIterator lineIterator = FileUtils.lineIterator(new File("/home/chyao/桌面/1.txt"), "UTF-8");
        while (lineIterator.hasNext()){
            System.out.println(lineIterator.nextLine());
        }

        //写出内容

        FileUtils.write(new File("/home/chyao/桌面/a.txt"),"hello world","UTF-8",true);
        FileUtils.writeStringToFile(new File("/home/chyao/桌面/a.txt"),"hello world","UTF-8",true);


        //复制文件
//        FileUtils.copyFileToDirectory();


    }
}
