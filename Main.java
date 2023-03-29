/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ffaaddeelll;

/**
 *
 * @author HP
 */
public class Main {



    public static void main(String[] args) {
        String StudentName = "fadel abudalu";
        double[] marks = {90, 69, 85, 96, 89, 85, 96, 100, 100};
        double studentGBA = getGBA(marks);
        printStudentData(StudentName, studentGBA);
        String rate = getRate(studentGBA);
        // System.out.println("the student rate is: "+getRate(studentGBA));
        System.out.println("The student rate is: " + rate);
    }

    public static double getGBA(double[] marksArray) {
        double sum = 0;
//        for (int i = 0; i < marksArray.length; i++) {
//            sum += marksArray[i];
//        }
        for (double mark : marksArray) {
            sum += mark;
        }
        return sum / marksArray.length;
    }

    public static void printStudentData(String studentName, double studentGBA) {
        System.out.println("Student name is: " + studentName + "\nStudent GBA = " + studentGBA);
    }

    public static String getRate(double gba) {
        if (gba >= 95 && gba <= 100) {
            return "A+";
        } else if (gba >= 90 && gba < 95) {
            return "A";
        } else if (gba >= 80 && gba < 90) {
            return "B+";
        } else if (gba >= 70 && gba < 80) {
            return "B";
        } else if (gba >= 60 && gba < 70) {
            return "C";
        } else {
            return "F";
        }
        //return "F";

}
}