package model.bl.room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.core.entity.Course;
import model.core.entity.ReadingRoom;

public class ReadingRoomService {
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
  
  public static List<ReadingRoom> getReadingRoomsByCourses(List<Course> courses) {
    return readingRoomList.stream().filter(r -> courses.contains(r.getCourse()))
        .collect(Collectors.toList());
  }
}
