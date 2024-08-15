package org.work_with_file;

import javax.xml.stream.StreamFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("test5.txt");
//        Files.createFile(pathFile);
//        String dialog = "-Privet\n-Privet\n-Kak dela\n-Horosho!\n-A u tebya kak\n-Toge ne ploho!";
//        Files.write(pathFile, dialog.getBytes(StandardCharsets.UTF_8));
        List<String> stringList = Files.readAllLines(pathFile);
        for (String s: stringList){
            System.out.println(s);
        }
    }
}
