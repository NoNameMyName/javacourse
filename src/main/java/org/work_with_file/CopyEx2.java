package org.work_with_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream =
                    new FileInputStream("C:\\Users\\NoName\\Pictures\\Ylands\\Screenshots\\11111111.bmp");
            FileOutputStream fileOutputStream =
                    new FileOutputStream("java_pic.bmp")
        ){
            int i;
            while ((i = fileInputStream.read()) != -1){
                fileOutputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
