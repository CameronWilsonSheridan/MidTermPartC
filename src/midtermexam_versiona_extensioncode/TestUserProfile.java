/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author camwi
 */
public class TestUserProfile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Would you like to create new profile (Y or N?)");
        if(in.next().trim().equalsIgnoreCase("n")){
            return;
        }
        UserProfile user = new UserProfile("tempName", "tempGenre");
        
        System.out.println("Please enter your name: ");
        user.setUserID(in.next());
        
        System.out.println("Please enter your favourite genre"
                + "based on the given list (Comedy, Drama, Action, Mystery");
        user.setGenre(in.next());
        
        System.out.println("userProfile was created");
    }
}
