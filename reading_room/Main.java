package reading_room;

import view.login.LoginView;

public class Main {
  public static void main(String[] args) {
    System.out.println("Yo");
    
    while (true) {
      if (LoginView.login()) {
        // logged in, show the next menu
      }
    }
  }
}
