package org.work_with_file.programmer2;

import org.work_with_file.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
            Employee employee1 = (Employee) inputStream.readObject();
            Employee employee2 = (Employee) inputStream.readObject();
            System.out.println(employee1);
            System.out.println(employee2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
