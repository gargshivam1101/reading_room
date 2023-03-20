package view.user;

import model.bl.user.InstructorService;
import model.core.entity.User;

public class InstructorView {

  public static void accessCourse(User loggedInUser) {
    System.out.println("The following students are studying your course together");
    InstructorService.accessCourse(loggedInUser);
  }
}
