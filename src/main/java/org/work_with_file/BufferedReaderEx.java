package org.work_with_file;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\NoName\\Pictures\\Feedback\\{623A5B12-8ACD-436D-B0E1-B12EDEC4CA7B}\\Capture001.png"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("java_pic.png"));
        )   {
            int character;
            while ((character = reader.read()) != -1){
                writer.write(character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
