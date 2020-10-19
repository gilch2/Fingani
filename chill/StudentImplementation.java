//Import the whole package
import java.util.*;
/* NAME:Fingani Gilbert Phiri
   REG NUMBER: BSC-ELE-21-18
This is the student implemantation*/
public class StudentImplementation{
    public static void main(String[]args){

//Creating Scanner Object
    Scanner input = new Scanner (System.in);
//Creating an object; Student for the class Student
   Student myStudent = new Student();

//Prompt the user to enter the Students Name
    System.out.println("ENTER NAME:");
    String myName = input.nextLine();
    myStudent.setName(myName);

//Prompt the user to enter the Students grades
    System.out.println("Enter the 1stgrade: ");
        double grade1 = input.nextDouble();
        System.out.println("Enter 2nd grade: ");
        double grade2 = input.nextDouble();
        System.out.println("Enter 3rd grade: ");
        double grade3 = input.nextDouble();
        myStudent.setGrades(grade1, grade2, grade3);

//Print the students details
       myStudent.studentDetail();
    }

}
