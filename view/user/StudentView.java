package view.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import controller.user.StudentController;
import model.core.entity.User;

public class StudentView {
  public static void bookRoom(User loggedInUser) {
    System.out.println("✦•······················•✦•······················•✦");
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter the textbook name you want to study");
    String textbook = scanner.nextLine();
    
    System.out.println("Please enter the course number you want to study");
    String courseNumber = scanner.nextLine();
    
    System.out.println("Enter the Date in DD-MM-YYYY format");
    String inputDate = scanner.nextLine();
    
    System.out.println("Enter the Time in HH:MM format");
    String inputTime = scanner.nextLine();
    
    System.out.println("Enter the duration of booking in hours");
    Integer duration = scanner.nextInt();
    String time = inputDate + " " + inputTime;
    
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    LocalDateTime timestamp = LocalDateTime.parse(time, dateFormatter);
    StudentController.bookRoom(textbook, courseNumber, timestamp, loggedInUser, duration);
  }
}
