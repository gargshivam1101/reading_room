package model.bl.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.core.entity.Course;
import model.core.entity.ReadingRoom;
import model.core.entity.User;
import model.course.CourseService;
import model.room.ReadingRoomService;

public class StudentService {
  
  public static void bookRoom(String textbook, String courseNumber, LocalDateTime timestamp,
      User loggedInUser, Integer duration) {
    ReadingRoom availableRoom = ReadingRoomService.getReadingRoomList().stream()
        .filter(r -> (r.getBeginTimeStamp().isBefore(timestamp)
            || r.getBeginTimeStamp().isEqual(timestamp)) && r.getEndTimeStamp().isAfter(timestamp))
        .filter(r -> r.getTextbook().equalsIgnoreCase(textbook)
            || r.getCourse().getCourseNumber().equalsIgnoreCase(courseNumber))
        .findFirst().orElse(null);
    
    if (availableRoom == null || availableRoom.getUserList().size() > 10) {
      // TODO: make a proper course instructor
      Course course = CourseService.getCourseByNumber(courseNumber);
      List<User> newUL = new ArrayList<>();
      newUL.add(loggedInUser);
      
      ReadingRoom newRR =
          new ReadingRoom(textbook, course, timestamp, timestamp.plusHours(duration), newUL);
      ReadingRoomService.pushReadingRoomList(newRR);
      System.out.println("You have been given a new room with id " + newRR.getId());
    } else {
      ReadingRoomService.popReadingRoomList(availableRoom);
      List<User> userList = availableRoom.getUserList();
      userList.add(loggedInUser);
      availableRoom.setUserList(userList);
      ReadingRoomService.pushReadingRoomList(availableRoom);
      System.out
          .println("You have been added to the existing room with id " + availableRoom.getId());
    }
  }
}
