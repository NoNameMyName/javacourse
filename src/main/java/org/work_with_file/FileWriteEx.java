package org.work_with_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) {
        String rubai = "Если вы просматриваете данное обращение, то Вы, несомненно уже в курсе, \n" +
                "что Java присутствует во всех сферах жизни и решает практически любые задачи. \n" +
                "На Java пишутся серверные приложения, веб приложения, разные программы для десктопа \n" +
                "ииии барабанная дробь. Если вы хотите научиться писать Android приложения, то Добро \n" +
                "пожаловать в мир Java. Ведь подавляющее большинство Android приложений пишется именно на Java.\n";
        String s = "Privet";
        try (FileWriter writer = new FileWriter("test4.txt", true);) {
//            for (int i = 0; i < rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            writer.append(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
