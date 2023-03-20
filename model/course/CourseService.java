package model.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import model.core.entity.Course;
import model.core.entity.User;
import model.core.enums.Role;

public class CourseService {
  static List<Course> courseList = new ArrayList<>(Arrays.asList(//
      new Course("COEN6311",
          new User("Instructor", "Prof", "ins@soen.com", "ins", Role.INSTRUCTOR))));
  
  public static List<Course> getCourseList() {
    return courseList;
  }
  
  public static void pushCourseList(Course course) {
    courseList.add(course);
  }
  
  public static void popCourseList(Course course) {
    courseList.remove(course);
  }
  
  public static Course getCourseByNumber(String courseNumber) {
    return courseList.stream().filter(c -> c.getCourseNumber().equalsIgnoreCase(courseNumber))
        .findFirst().orElse(null);
  }
  
  public static List<Course> getCoursesByInstructor(User instructor) {
    return courseList.stream()
        .filter(c -> c.getCourseInstructor().getEmail().equalsIgnoreCase(instructor.getEmail()))
        .collect(Collectors.toList());
  }
}
