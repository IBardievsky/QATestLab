package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseScript {

    private WebDriver wd;

    public LoginTest (WebDriver wd){
        this.wd=wd;
    }

    public void login(String email, String password){
        wd.findElement(By.id("email")).sendKeys(email);
        wd.findElement(By.id("passwd")).sendKeys(password);
        wd.findElement(By.className("ladda-label")).click();
    }

    public void logout (){
        wd.findElement(By.className("employee_avatar_small")).click();
        wd.findElement(By.className("icon-signout")).click();
    }

    public static void main(String[] args) throws InterruptedException {

    }
}

