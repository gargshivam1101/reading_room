package model.bl.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.core.entity.Course;
import model.core.entity.ReadingRoom;
import model.core.entity.User;

public class StudentService {
  static List<ReadingRoom> readingRoomList = new ArrayList<>();
  
  public static List<ReadingRoom> getReadingRoomList() {
    return readingRoomList;
  }
  
  public static void pushReadingRoomList(ReadingRoom readingRoom) {
    readingRoomList.add(readingRoom);
  }
  
  public static void popReadingRoomList(ReadingRoom readingRoom) {
    readingRoomList.remove(readingRoom);
  }
  
  public static void bookRoom(String textbook, String courseNumber, LocalDateTime timestamp,
      User loggedInUser) {
    List<ReadingRoom> availableRooms = getReadingRoomList().stream().filter(
        r -> r.getBeginTimeStamp().isBefore(timestamp) && r.getEndTimeStamp().isAfter(timestamp))
        .filter(r -> r.getTextbook().equalsIgnoreCase(textbook)
            || r.getCourse().getCourseNumber().equalsIgnoreCase(courseNumber))
        .collect(Collectors.toList());
    
    // there will be only one available room, so
    ReadingRoom availableRoom = availableRooms.get(0);
    
    if (availableRoom == null || availableRoom.getUserList().size() <= 10) {
      // TODO: make a proper course instructor
      Course course = new Course(courseNumber, loggedInUser);
      List<User> newUL = new ArrayList<>();
      newUL.add(loggedInUser);
      
      ReadingRoom newRR = new ReadingRoom(textbook, course, timestamp, timestamp, newUL);
      pushReadingRoomList(newRR);
    } else {
      // add user by pushing in userlist
      popReadingRoomList(availableRoom);
      List<User> userList = availableRoom.getUserList();
      userList.add(loggedInUser);
      availableRoom.setUserList(userList);
      pushReadingRoomList(availableRoom);
    }
  }
}
