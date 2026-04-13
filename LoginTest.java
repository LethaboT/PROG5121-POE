/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.login.Login; 
/**
 *
 * @author ASUS
 */
public class LoginTest {
    Login myApp= new Login();
    
    //username Test
    @Test 
    public void testUserNameCorrect() {
        assertEquals(true, myApp.checkUserName("ky_1")) ;
    }
    
    @Test 
    public void testUserNameIncorrect() {
        assertEquals(false, myApp.checkUserName("kyle!!!")) ;
    }
    
    //Password Tests
    @Test
    public void testPasswordCorrect()  {
        assertEquals(true, myApp.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @Test 
    public void testPasswordIncorrect() {
        assertEquals( false, myApp.checkPasswordComplexity("password"));
    }
    
    //Cell Phone Tests
    @Test 
    public void testCellPhoneNumber() {
        assertEquals(true, myApp.checkCellPhoneNumber("+27838968976"));
    }
    
    @Test public void testCellPhoneNumberIncorrect() {
        assertEquals(false, myApp.checkCellPhoneNumber("08966553"));
    }
    
    //Login Tests
    @Test 
    public void testLoginSuccess(){
        myApp.registerUser("ky_1", "Ch&&sec@ke99!", "+27838968976");
        assertEquals(true , myApp.loginUser("ky_1", "Ch&&sec@ke99!"));
    }
    @Test
    public void testLoginFail() {
        myApp.registerUser("ky_1", "Ch&&sec@ke99!", "+27838968976");
        assertEquals( false, myApp.loginUser("ky_1", "wrong"));
    }
       
    }
    
