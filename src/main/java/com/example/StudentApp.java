package com.example;

public class StudentApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     STUDENT MANAGEMENT APP");
        System.out.println("=================================");

        Student student = new Student(
                101,
                "Vignesh",
                "CSE"
        );

        System.out.println();

        student.displayStudent();

        System.out.println();
        System.out.println("Application executed successfully!");
    }
}