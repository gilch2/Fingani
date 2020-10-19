/* NAME:Fingani Gilbert Phiri
   REG NUMBER: BSC-ELE-21-18
This Program will get the name of the student and three grades then compute
their average grade and return it to a printing method*/

// Creating the class Student
class Student{
//Restricted access ;private
    private String name;
    private double [] grade = new double [3];
    private int totalNumberOfStudents= 0;

//Creation of a constructor
public  Student(){
}
//Creating the Setter for Name
public void setName(String name){
    this.name =name;
}
//Getter for Name
public String getName(){
    return name;
}
public void setGrades(double grade1,double grade2,double grade3){
    grade[0]=grade1;
    grade[1]=grade2;
    grade[2]=grade3;

}
//Calculating Average grade
public double getAverageGrade(){
        double sum = 0;
        for(int i = 0; i < 3; i++){
            sum += grade[i];
        }
        return sum /3;
    }

//Getter for Number of Students
public int getNumberOfStudent(){
        return totalNumberOfStudents;
}
//Print the Students details
public void studentDetail(){
        System.out.println("Student name is "+ getName() +
        " average grade is "+ getAverageGrade() +
       " " +"and the current number of students is "+ getNumberOfStudent());

}
}