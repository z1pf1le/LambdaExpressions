import java.util.ArrayList;

public class StudentInfo{

    void printStudentsOverGrade(ArrayList<Student> a1, double grade){
        for(Student s: a1){
            if(s.avgGrade>grade){
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> a1, double age){
        for(Student s: a1){
            if(s.age<age){
                System.out.println(s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex){
        for(Student s: a1){
            if(s.age<age && s.avgGrade<grade && s.sex==sex){
                System.out.println(s);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student ("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student ("Ivan2", 'f', 32, 1, 7.3);
        Student st3 = new Student ("Ivan3", 'm', 12, 2, 3.3);
        Student st4 = new Student ("Ivan4", 'f', 2, 4, 4.3);
        Student st5 = new Student ("Ivan5", 'm', 222, 5, 6.3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
        info.printStudentsOverGrade(students, 8);
        System.out.println("______________");
        info.printStudentsUnderAge(students, 22);
        System.out.println("______________");
        info.printStudentsMixCondition(students, 22, 4, 'm');
    }
}
