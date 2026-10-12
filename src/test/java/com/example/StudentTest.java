package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentId() {

        Student student = new Student(
                101,
                "Vignesh",
                "CSE"
        );

        assertEquals(101, student.getId());
    }

    @Test
    public void testStudentName() {

        Student student = new Student(
                101,
                "Vignesh",
                "CSE"
        );

        assertEquals("Vignesh", student.getName());
    }

    @Test
    public void testStudentCourse() {

        Student student = new Student(
                101,
                "Vignesh",
                "CSE"
        );

        assertEquals("CSE", student.getCourse());
    }
}
