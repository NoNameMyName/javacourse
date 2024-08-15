package org.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for (Student s: al
             ) {
            if (pr.test(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentOverGrade(ArrayList<Student> al, double grade){
//        for (Student st: al
//             ) {
//            if (st.avgGrade > grade){
//                System.out.println(st);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> al, int age){
//        for (Student st: al
//        ) {
//            if (st.age < age){
//                System.out.println(st);
//            }
//        }
//    }
//    void printStudentsMixComndition(ArrayList<Student> al, double grade, int age, char sex){
//        for (Student st: al
//        ) {
//            if (st.age > age && st.avgGrade < grade && st.sex == sex){
//                System.out.println(st);
//            }
//        }
//    }
}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Niklolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        //System.out.println(students);

        StudentInfo info = new StudentInfo();

        Function<Student, Double> f = student -> {
            return student.avgGrade;
        };
        double res = avgOfSmth(students, f);
        double res2 = avgOfSmth(students, (Student st) -> (double) st.age);
        System.out.println(res);
        System.out.println(res2);

    }
    public static double avgOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for (Student student: list){
            result +=f.apply(student);
        }
        result = result / list.size();
        return result;
    }
}

//        info.testStudents(students, s -> s.age < 30);
//
//        Predicate<Student> pr1 = st -> st.age < 30;
//        Predicate<Student> pr2 = st -> st.avgGrade > 8.0;
//
//        System.out.println("-----------------");
//        info.testStudents(students, pr1.and(pr2));
//        System.out.println("-----------------");
//        info.testStudents(students, pr1.or(pr2));
//        System.out.println("-----------------");
//        info.testStudents(students, pr1.negate());
//        info.testStudents(students, new ChechOverGrade());
//        System.out.println("-----------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age>30;
//            }
//        });
        /*System.out.println("-----------------");
        info.testStudents(students, (Student s) -> {return s.age > 30;});

        info.testStudents(students, (Student s) -> {
            System.out.println("Hello");
            return s.age > 30;});

        info.testStudents(students, (Student s) -> s.age > 30);

        info.testStudents(students, s -> {return s.age > 30;});

        info.testStudents(students, s -> s.age > 30);







        System.out.println("-----------------");
        info.testStudents(students, (Student s) -> {return s.avgGrade > 9;});
        System.out.println("-----------------");
        info.testStudents(students, (Student s) -> {return s.age > 20 && s.avgGrade > 8 && s.sex == 'f';});*/
//        info.printStudentOverGrade(students, 8.0);
//        System.out.println("-----------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("-----------------");
//        info.printStudentsMixComndition(students, 9.5 , 20, 'f');
    //}
//}
//interface StudentChecks{
//    boolean check(Student s);
//}

//class ChechOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade>8;
//    }
//}