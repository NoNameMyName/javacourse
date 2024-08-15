package org.generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maha", 12);
        Schoolar schoolar3 = new Schoolar("Sergey", 11);
        Schoolar schoolar4 = new Schoolar("Olya", 15);

        Student student1 = new Student("Kolya", 19);
        Student student2 = new Student("Andrey", 20);

        Employee employee1 = new Employee("Arsen", 35);
        Employee employee2 = new Employee("Anton", 28);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        Team<Schoolar> schoolarTeam2 = new Team<>("Spirits");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        //schoolarTeam.addNewParticipant(student1);;
        //schoolarTeam.addNewParticipant(employee1);
        Team<Student> studentTeam = new Team<>("Vpered");
        Team<Employee> employeeTeam = new Team<>("Rabotyagi");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        schoolarTeam.playWith(schoolarTeam2);
        schoolarTeam.playWith(schoolarTeam2);
        schoolarTeam.playWith(schoolarTeam2);
    }
}
