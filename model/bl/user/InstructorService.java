package model.bl.user;

import java.util.List;
import model.bl.course.CourseService;
import model.bl.room.ReadingRoomService;
import model.core.entity.Course;
import model.core.entity.ReadingRoom;
import model.core.entity.User;

public class InstructorService {
  
  public static void accessCourse(User loggedInUser) {
    List<Course> courses = CourseService.getCoursesByInstructor(loggedInUser);
    List<ReadingRoom> readingRooms = ReadingRoomService.getReadingRoomsByCourses(courses);
    
    for (ReadingRoom readingRoom : readingRooms) {
      System.out.println("Reading Room ID: " + readingRoom.getId());
      for (User user : readingRoom.getUserList()) {
        System.out.println("Users:" + user.getFirstName() + " " + user.getLastName());
      }
    }
  }
}
