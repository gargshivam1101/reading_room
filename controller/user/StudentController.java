package controller.user;

import java.time.LocalDateTime;
import model.bl.user.StudentService;
import model.core.entity.User;

public class StudentController {
  
  public static void bookRoom(String textbook, String courseNumber, LocalDateTime timestamp,
      User loggedInUser, Integer duration) {
    StudentService.bookRoom(textbook, courseNumber, timestamp, loggedInUser, duration);
  }
}
