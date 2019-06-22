package problems;

import java.util.*;

public class SortStudents {
    class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public Student getNewStudent(String name,int age){
        return new Student(name,age);
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        SortStudents sortStudents = new SortStudents();

        studentList.add(sortStudents.getNewStudent("Juan",54));
        studentList.add(sortStudents.getNewStudent("Rafael",53));
        studentList.add(sortStudents.getNewStudent("Jesus",17));
        /*Collections.sort(studentList,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.name.compareTo(s2.name);
            }
        });*/
        Collections.sort(studentList,(x,y)->{
            return x.name.compareTo(y.name);
        });
        studentList.forEach(System.out::println);
    }
}