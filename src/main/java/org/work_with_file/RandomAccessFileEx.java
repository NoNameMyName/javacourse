package org.work_with_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file = new RandomAccessFile("test5.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();;
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();;
            System.out.println(s2);
            long position = file.getFilePointer();
//            file.seek(0);
//            file.writeBytes("Privet");
            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tAuthor William Butler Yeats");
            System.out.println(position);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
