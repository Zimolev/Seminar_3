package org.example.SeminarWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 2.	Дан массив объектов: фамилия студента, номер группы,
 * размер стипендии, баллы по 3 предметам. Определить стипендии студентов,
 * фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */

public class StudentMain {
    public static void main(String[] args) {
        Random random = new Random();
        List<Student> students = createArrayList(random);

        for (Student student: students) {
            int sumMarks = 0;
            for (int mark:student.getMarks()) {
                sumMarks += mark;
            }
            if (student.getFIO().endsWith("ова") && sumMarks % 2 == 0){
                System.out.println(student.getSalary());
            }
        }
    }


    private static ArrayList<Student> createArrayList(Random random) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Зимник", random.nextInt(100000),
                random.nextInt(5), List.of(random.nextInt(1, 5),
                random.nextInt(1, 5), random.nextInt(1, 5))));
        students.add(new Student("Иванов", random.nextInt(100000),
                random.nextInt(5), List.of(random.nextInt(1, 5),
                random.nextInt(1, 5), random.nextInt(1, 5))));
        students.add(new Student("Пертова", random.nextInt(100000),
                random.nextInt(5), List.of(random.nextInt(1, 5),
                random.nextInt(1, 5), random.nextInt(1, 5))));
        students.add(new Student("Сидоров", random.nextInt(100000),
                random.nextInt(5), List.of(random.nextInt(1, 5),
                random.nextInt(1, 5), random.nextInt(1, 5))));
        students.add(new Student("Лакова", random.nextInt(100000),
                random.nextInt(5), List.of(random.nextInt(1, 5),
                random.nextInt(1, 5), random.nextInt(1, 5))));

        return students;
    }


}
