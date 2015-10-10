import java.util.Random;

public class StudentController {
   private Student model;
   private StudentView view;

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name);		
   }

   public String getStudentName(){
      return model.getName();		
   }

   public void setStudentRollNo(int rollNo){
      model.setRollNo(rollNo);		
   }

   public int getStudentRollNo(){
      return model.getRollNo();		
   }

   public void updateView(){				
      view.printStudentDetails(model.getName(), model.getRollNo());
   }	
   
   public static int getRandNum(){
   Random rand = new Random();
   int randomNum1 = rand.nextInt((6 - 1) + 1) + 1;
   int randomNum2 = rand.nextInt((6 - 1) + 1) + 1;
return randomNum2 + randomNum1;
   }
}