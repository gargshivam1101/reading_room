package model.core.entity;

import model.core.enums.Role;

public class User {
  
  private String firstName;
  
  private String lastName;
  
  private String email;
  
  private String password;
  
  private Role role;
  
  public User(String firstName, String lastName, String email, String password, Role role) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.role = role;
  }
  
  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }
  
  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }
  
  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }
  
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }
  
  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }
  
  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }
  
  /**
   * @return the role
   */
  public Role getRole() {
    return role;
  }
  
  /**
   * @param role the role to set
   */
  public void setRole(Role role) {
    this.role = role;
  }
  
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("User [firstName=").append(firstName).append(", lastName=").append(lastName)
        .append(", email=").append(email).append(", password=").append(password).append(", role=")
        .append(role).append("]");
    return builder.toString();
  }
}
