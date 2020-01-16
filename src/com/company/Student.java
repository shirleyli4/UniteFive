package com.company;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
    private String name;
    private double t1;
    private double t2;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        t1=0;
        t2=0;
        name=studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("enter the student's score for test 1");
        Scanner input = new Scanner(System.in);
        t1=input.nextDouble();
        System.out.println("enter the student's score for test 2");
        t2=input.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage() {
        //add body of getAverage
        double aver = (t1+t2)/2;
        return aver;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String printName(){
        //add body of printName
        return name;
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
    public String toString(){
        return "Name: "+name+" \n"+"Test1: "+t1+"\n"+" Test2: "+t2;
    }


}
