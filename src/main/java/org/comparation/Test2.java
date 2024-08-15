package org.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee em1 = new Employee(100, "Zaur", "Trigulov", 12345);
        Employee em2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee em3 = new Employee(123, "Ivan", "Sidorov", 8542);
        employees.add(em1);
        employees.add(em2);
        employees.add(em3);
        System.out.println("Before sorting\n" + employees);
        Collections.sort(employees, new SallaryComparator());
        System.out.println("After sorting\n" + employees);
    }
}


class Employee
        implements Comparable<Employee>
{
    Integer id;
    String name;
    String surname;
    int sallary;

    public Employee(int id, String name, String surname, int sallary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sallary=" + sallary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id.equals(anotherEmp.id)){
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        }
        else return 1;
////        return this.id-anotherEmp.id;
////        return this.id.compareTo(anotherEmp.id);
////        int res = this.id.compareTo(anotherEmp.id);
////        if (res == 0){
////            res = this.surname.compareTo(anotherEmp.surname);
////        }
////        return res;
    }
}

class IdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id.equals(emp2.id)){
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        }
        else return 1;
    }
}

class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
class SallaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.sallary-emp2.sallary;
    }
}