public class StudentModel {
   public static void main(String[] args) {

      Student model  = retriveStudentFromDatabase();

      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
      
      controller.setStudentName("Kathryn");

      controller.updateView();
      
      controller.setStudentName("Rexx");

      controller.updateView();
      
      controller.setStudentName("Harry");

      controller.updateView();
      
      controller.setStudentName("Mikayla");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Robert");
      student.setRollNo((int) Math.random());
      return student;
   }
}