package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Paul",new Teacher("Cate Blanchett")));
        students.add(new Student("Cate Blanchett",null));
        students.add(new Student("Marko Plesa",null));
        students.add(new Student("David Niehuser",new Teacher("Mark Wharton")));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + " is taught by a teacher: " + teacherName.getName() + ".");
        }
    }
}
