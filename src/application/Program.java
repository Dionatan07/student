package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os dados: ");
        String name = teclado.nextLine();
        double grade1 = teclado.nextDouble();
        double grade2 = teclado.nextDouble();
        double grade3 = teclado.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        System.out.print("FINAL GRADE = " + String.format("%.2f%n", student.finalGrade()));

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
        }else{
            System.out.println("PASS");
        }

    }
}
