package controller.user;

import model.bl.user.InstructorService;
import model.core.entity.User;

public class InstructorController {
  
  public static void accessCourse(User loggedInUser) {
    InstructorService.accessCourse(loggedInUser);
  }
  
}
