package com.vetias.java.workshop.basics;
public class StudentDetails{

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculateSumAndAverage();
        assignGrade();
    }

    private void calculateSumAndAverage() {
        sum = 0;
        if (marks != null && marks.length > 0) {
            for (int mark : marks) {
                sum += mark;
            }
            average = (double) sum / marks.length;
        } else {
            average = 0.0;
        }
    }

    private void assignGrade() {
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    public String getGrade() {
        return grade;
    }
    
    
}
