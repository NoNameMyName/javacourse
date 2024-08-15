package org.work_with_file.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    transient double salary;
//    int age;
    Car car;

    public Employee(String name, String surname, String department, double salary, int age, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
//        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
//                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
