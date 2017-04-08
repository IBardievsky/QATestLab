package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;


/**
 * Created by User on 4/3/2017.
 */
public class MainTest extends BaseScript {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = getDriver();
    LoginTest loginTest = new LoginTest(driver);
    CheckMainMenuTest check = new CheckMainMenuTest(driver);

    driver.get(Properties.getBaseAdminUrl());

    loginTest.login("webinar.test@gmail.com","Xcg7299bnSmMuRLp9ITw");

    sleep(1000);
    check.titleOfDashboard();
    check.titleOfOrders();
    check.titleOfCustomers();
    check.titleOfSupport();

    loginTest.logout();

    driver.quit();
  }

}
