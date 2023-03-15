package view.login;

import java.util.Scanner;
import controller.user.LoginController;

public class LoginView {
  
  public static Boolean login() {
    System.out.println("✦•······················•✦•······················•✦");
    System.out.println("Please login with your registered credentials");
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Email Id: ");
    String email = scanner.nextLine();
    System.out.println("Password: ");
    String password = scanner.nextLine();
    
    return LoginController.login(email, password);   
  }
}
