/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

/**
 *
 * @author ASUS
 */import java.util.Scanner; 
     public class Login {
      String username;
      String password;
      String cellPhoneNumber; 
       
   //Check username
      public boolean checkUserName(String username){
       return username.contains("_")&& username.length() <=5; 
      }
   //Check password
     public 
        boolean checkPasswordComplexity(String password){
      boolean hasUpper= false;
      boolean hasNumber= false;
      boolean hasSpecial=false;
      
      for (char c: password.toCharArray()) {
         if (Character.isUpperCase(c)) hasUpper=true; 
          if (Character.isDigit(c)) hasNumber=true;
           if (!Character.isLetterOrDigit(c)) hasSpecial= true; 
      } 
       return password.length() >=8 && hasUpper && hasNumber &&hasSpecial;
      } 
   //Check cell Number
     public 
        boolean checkCellPhoneNumber(String cellPhoneNumber) {
       return cellPhoneNumber.startsWith("+27")&& cellPhoneNumber.length()==12; 
   } 
   //Register the user
   public String registerUser(String username, String password, String cellNumber){ 
       if (!checkUserName(username)) {
           return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters"; 
       }
       if (!checkPasswordComplexity(password)) {
           return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, "
                   + "a number and a special character."; 
       }
      if (!checkCellPhoneNumber(cellNumber)) {
          return "Cell number is incorrectly formatted or does not contain an international code."; 
      }   
          this.username= username;
          this.password=password;
          this.cellPhoneNumber= cellNumber;
          
          return "User registered successfully";
       }
   //Login User 
   public 
           boolean loginUser(String username, String password) {
          return this.username.equals(username) && this.password.equals(password);
          
           }
     //Return login status 
           public String returnLoginStatus(boolean status) {
               if (status) {
                   return " Welcome <user first name> , < user last name> , it is great to see you again."; 
               }
               else {
               return "Username or password incorrect, please try again." ; 
               } 
           } 
                   
     // Main method for testing manually 
           public static void main(String[]args) {
               
               Scanner myInput= new Scanner(System.in);
               Login myApp = new Login(); 
               
               System.out.print("Enter username: ");
               String username= myInput.nextLine(); 
               
               System.out.print("Enter password: ");
               String password= myInput.nextLine();
               
               System.out.print("Enter cell number: ");
               String cellNumber= myInput.nextLine(); 
               
               System.out.println(myApp.registerUser(username,password,cellNumber));
               
               System.out.print("\nLOGIN");
               
               System.out.print("\nEnter username: ");
               String loginUser =myInput.nextLine(); 
               
               System.out.print("Enter password: ");
               String loginPass= myInput.nextLine();
               
               boolean status = myApp.loginUser(loginUser,loginPass); 
               System.out.println(myApp.returnLoginStatus(status));
               
           }
     }
          
      
       
      
           
           
   
           
    

