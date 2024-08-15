package org.work_with_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test4.txt");
        File folder = new File("C:\\Users\\NoName\\Desktop\\a");
        File file1 = new File("C:\\Users\\NoName\\Desktop\\a\\test20.txt");
        File folder1 = new File("C:\\Users\\NoName\\Desktop\\b");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("-----------");
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("-----------");
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("-----------");
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println(file1.exists());
        System.out.println(folder1.exists());
        System.out.println("-----------");
        System.out.println(file1.createNewFile());
        System.out.println(folder1.mkdir());
        System.out.println("-----------");
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-----------");
        System.out.println(file1.isHidden());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.canExecute());
        System.out.println("-----------");
        System.out.println("-----------");
    }
}
