package Accord.J13_Part2.Question3;

/*
    Using Console class read username and password form user and display welcome message if username
is “accord” and password is “java”. Else display an “Invalid Login Credentials”.
 */
import java.io.Console;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Console console = System.console();
        if (console != null) {
            String username = console.readLine("Enter username: ");

            char[] passwordArray = console.readPassword("Enter password: ");
            String password = new String(passwordArray);

            Arrays.fill(passwordArray, ' ');

            if (username.equals("accord") && password.equals("java")) {
                System.out.println("Welcome, " + username + "!");
            } else {
                System.out.println("Invalid Login Credentials");
            }
        }
        else {
            System.out.println("Console not available. Please run this program in a console environment.");
        }
    }
}
