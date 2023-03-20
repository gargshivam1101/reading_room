package reading_room;

import model.core.entity.User;
import model.core.enums.Role;
import view.login.LoginView;
import view.user.InstructorView;
import view.user.StudentView;

public class Main {
  public static void main(String[] args) {
    while (true) {
      User loggedInUser = LoginView.login();
      if (loggedInUser == null) {
        continue;
      }
      
      // Authenticated user
      if (Role.INSTRUCTOR.equals(loggedInUser.getRole())) {
        InstructorView.accessCourse(loggedInUser);
      } else if (Role.STUDENT.equals(loggedInUser.getRole())) {
        StudentView.bookRoom(loggedInUser);
      }
    }
  }
}
