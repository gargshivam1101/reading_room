package controller.user;

import model.bl.user.UserService;

public class LoginController {
  public static Boolean login(String email, String password) {
    return UserService.login(email, password);
  }
}
