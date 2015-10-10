public class StudentView {
   public void printStudentDetails(String studentName, int d){
      System.out.println("Student Name: " + studentName);
      System.out.println("Roll No: " + StudentController.getRandNum());
   }
}