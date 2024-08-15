package org.work_with_file.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car1 = new Car("Ford Fusion", "White");
        Car car2 = new Car("Ford Kuga", "Black");
        Employee employee1 = new Employee("Oleg","Popov", "IT", 540, 28, car1);
        Employee employee2 = new Employee("Danya","Frolov", "SP", 320, 22, car2);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee1);
            outputStream.writeObject(employee2);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
