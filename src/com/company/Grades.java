package com.company;
// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        //create student2, "Mike"
        Student s2 = new Student("Mike");
        //input grades for Mary
        student1.inputGrades();
        //print Mary
        System.out.println(student1);
        //use getAverage to calculate & print average for Mary
        System.out.println("Average: "+student1.getAverage());
        System.out.println();
        //input grades for Mike
        s2.inputGrades();
        //print Mike
        System.out.println(s2);
        //use getAverage to calculate & print average for Mike
        System.out.println("Average: "+s2.getAverage());
    }
}

