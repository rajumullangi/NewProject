package raju;
//Registration Example:
import java.util.Scanner;
public class SignUp {
 static Register register = new Register();

 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Enter firstName => ");
         register.setFirstName(scanner.nextLine());
         System.out.print("Enter lastName => ");
         register.setLastName(scanner.nextLine());
         System.out.print("Enter userName => ");
         register.setUserName(scanner.nextLine());
         System.out.print("Enter password => ");
         register.setPassword(scanner.nextLine());
         System.out.print("Enter emailId => ");
         register.setEmailId(scanner.nextLine());
         System.out.print("Enter phoneNo => ");
         register.setPhoneNo(scanner.nextLong());

         System.out.println(register.toString());
     }
 }
}

class Register {
 private String firstName;
 private String lastName;
 private String userName;
 private String password;
 private String emailId;
 private long phoneNo;

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }

 public String getUserName() {
     return userName;
 }

 public void setUserName(String userName) {
     this.userName = userName;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 public String getEmailId() {
     return emailId;
 }

 public void setEmailId(String emailId) {
     this.emailId = emailId;
 }

 public long getPhoneNo() {
     return phoneNo;
 }

 public void setPhoneNo(long phoneNo) {
     this.phoneNo = phoneNo;
 }

 @Override
 public String toString() {
     return "Register [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" +
         password + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
 }
}