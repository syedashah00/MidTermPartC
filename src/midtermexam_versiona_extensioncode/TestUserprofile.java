/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author theop
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Available genres:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        
        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int genreChoice = scanner.nextInt();
        
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice. Please try again.");
            return;
        }
        
        UserProfile userProfile = new UserProfile(userName, genres[genreChoice - 1]);
        
        System.out.println("User profile created successfully for " + userName + ".");
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
        
        scanner.close();
    }
}
