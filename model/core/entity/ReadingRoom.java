package model.core.entity;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadingRoom {
  
  private static final AtomicInteger count = new AtomicInteger(0);
  
  private Integer id;
  
  private Integer bookedSeatsCount;
  
  private String textbook;
  
  private String courseNumber;
  
  private LocalDateTime beginTimeStamp;
  
  private LocalDateTime endTimeStamp;
  
  

  public ReadingRoom(Integer id, Integer bookedSeatsCount, String textbook, String courseNumber,
      LocalDateTime beginTimeStamp, LocalDateTime endTimeStamp) {
    super();
    this.id = count.incrementAndGet();;
    this.bookedSeatsCount = bookedSeatsCount;
    this.textbook = textbook;
    this.courseNumber = courseNumber;
    this.beginTimeStamp = beginTimeStamp;
    this.endTimeStamp = endTimeStamp;
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
   * @return the bookedSeatsCount
   */
  public Integer getBookedSeatsCount() {
    return bookedSeatsCount;
  }

  /**
   * @param bookedSeatsCount the bookedSeatsCount to set
   */
  public void setBookedSeatsCount(Integer bookedSeatsCount) {
    this.bookedSeatsCount = bookedSeatsCount;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ReadingRoom [id=").append(id).append(", bookedSeatsCount=")
        .append(bookedSeatsCount).append(", textbook=").append(textbook).append(", courseNumber=")
        .append(courseNumber).append(", beginTimeStamp=").append(beginTimeStamp)
        .append(", endTimeStamp=").append(endTimeStamp).append("]");
    return builder.toString();
  }
}
