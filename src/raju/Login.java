package raju;
import java.util.Scanner;
public class Login {
 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Enter user name => ");
         String userName = scanner.nextLine();
         System.out.print("Enter password => ");
         String password = scanner.nextLine();

         if ("raju".equals(userName) && "1436Raju".equals(password)) {
             System.out.println("User successfully logged-in.");
         } else {
             System.out.println("Invalid username or password.");
         }
        
     }
    
 }
 public class Lim{
	 System.out.println("Uno Dos tres HALA MADRID.......");
 }
}
