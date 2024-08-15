package org.work_with_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\NoName\\Desktop\\M");
        Path directorybPath = Paths.get("C:\\Users\\NoName\\Desktop\\b");

//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        Files.delete(directoryPath.resolve("test15.txt"));

//        Files.copy(directorybPath, directoryPath.resolve("B"));
//        Files.move(filePath, directoryPath.resolve("text15.txt"));
//        Files.move(Paths.get("test5.txt"), Paths.get("test6.txt"));
//        Files.delete(Paths.get("test5.tx"));
        System.out.println("Done");
//        Files.delete(directorybPath);
        Files.delete(directoryPath);

    }
}
