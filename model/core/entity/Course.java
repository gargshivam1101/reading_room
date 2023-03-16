package model.core.entity;

public class Course {
  private String courseNumber;
  
  private User courseInstructor;

  public Course(String courseNumber, User courseInstructor) {
    super();
    this.courseNumber = courseNumber;
    this.courseInstructor = courseInstructor;
  }

  /**
   * @return the courseNumber
   */
  public String getCourseNumber() {
    return courseNumber;
  }

  /**
   * @param courseNumber the courseNumber to set
   */
  public void setCourseNumber(String courseNumber) {
    this.courseNumber = courseNumber;
  }

  /**
   * @return the courseInstructor
   */
  public User getCourseInstructor() {
    return courseInstructor;
  }

  /**
   * @param courseInstructor the courseInstructor to set
   */
  public void setCourseInstructor(User courseInstructor) {
    this.courseInstructor = courseInstructor;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Course [courseNumber=").append(courseNumber).append(", courseInstructor=")
        .append(courseInstructor).append("]");
    return builder.toString();
  }
}
