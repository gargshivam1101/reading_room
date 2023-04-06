package view.user;

import controller.user.InstructorController;
import model.core.entity.User;

public class InstructorView {
  
  public static void accessCourse(User loggedInUser) {
    System.out.println("The following students are studying your course together");
    
    InstructorController.accessCourse(loggedInUser);  
  }
}
