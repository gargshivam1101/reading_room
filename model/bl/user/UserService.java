package model.bl.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.core.entity.User;
import model.core.enums.Role;

public class UserService {
  static User loggedInUser = null;
  
  static List<User> userList = new ArrayList<>(Arrays.asList(//
      new User("Instructor", "Prof", "ins@soen.com", "ins", Role.INSTRUCTOR), //
      new User("Student", "1", "stu1@soen.com", "stu", Role.STUDENT), //
      new User("Student", "2", "stu2@soen.com", "stu", Role.STUDENT //
      )));
      
  public static List<User> getUserList() {
    return userList;
  }
  
  public static void putUserList(User user) {
    userList.add(user);
  }
  
  public static User login(String email, String password) {
    
    User lgInUser = getUserList().stream()
        .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
        .findFirst().orElse(null);
    
    if (lgInUser == null) {
      System.out.println("Sorry, you have entered wrong credentials!");
      return null;
    }
    
    loggedInUser = lgInUser;
    
    System.out.println("Welcome " + lgInUser.getFirstName());
    System.out.println("You have been successfully logged in");
    return lgInUser;
  }
}
