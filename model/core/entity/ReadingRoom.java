package model.core.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadingRoom {
  
  private static final AtomicInteger count = new AtomicInteger(0);
  
  private Integer id;
  
  private String textbook;
  
  private Course course;
  
  private LocalDateTime beginTimeStamp;
  
  private LocalDateTime endTimeStamp;
  
  private List<User> userList;

  public ReadingRoom(String textbook, Course course, LocalDateTime beginTimeStamp,
      LocalDateTime endTimeStamp, List<User> userList) {
    super();
    this.id = count.incrementAndGet();;
    this.textbook = textbook;
    this.course = course;
    this.beginTimeStamp = beginTimeStamp;
    this.endTimeStamp = endTimeStamp;
    this.userList = userList;
  }

  /**
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return the textbook
   */
  public String getTextbook() {
    return textbook;
  }

  /**
   * @param textbook the textbook to set
   */
  public void setTextbook(String textbook) {
    this.textbook = textbook;
  }

  /**
   * @return the course
   */
  public Course getCourse() {
    return course;
  }

  /**
   * @param course the course to set
   */
  public void setCourse(Course course) {
    this.course = course;
  }

  /**
   * @return the beginTimeStamp
   */
  public LocalDateTime getBeginTimeStamp() {
    return beginTimeStamp;
  }

  /**
   * @param beginTimeStamp the beginTimeStamp to set
   */
  public void setBeginTimeStamp(LocalDateTime beginTimeStamp) {
    this.beginTimeStamp = beginTimeStamp;
  }

  /**
   * @return the endTimeStamp
   */
  public LocalDateTime getEndTimeStamp() {
    return endTimeStamp;
  }

  /**
   * @param endTimeStamp the endTimeStamp to set
   */
  public void setEndTimeStamp(LocalDateTime endTimeStamp) {
    this.endTimeStamp = endTimeStamp;
  }

  /**
   * @return the userList
   */
  public List<User> getUserList() {
    return userList;
  }

  /**
   * @param userList the userList to set
   */
  public void setUserList(List<User> userList) {
    this.userList = userList;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ReadingRoom [id=").append(id).append(", textbook=").append(textbook)
        .append(", course=").append(course).append(", beginTimeStamp=").append(beginTimeStamp)
        .append(", endTimeStamp=").append(endTimeStamp).append(", userList=").append(userList)
        .append("]");
    return builder.toString();
  }
}
