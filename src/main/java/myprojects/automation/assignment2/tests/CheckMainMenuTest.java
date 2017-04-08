package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckMainMenuTest extends BaseScript{

    private WebDriver wd;

    public CheckMainMenuTest (WebDriver wd){
        this.wd = wd;
    }

    private void chechBeforeAndAfter () {
        System.out.println(wd.findElement(By.className("page-title")).getText() + " before refresh");
        wd.navigate().refresh();
        System.out.println(wd.findElement(By.className("page-title")).getText() + " after refresh");
    }

    public void titleOfDashboard(){
        chechBeforeAndAfter();
    }

    public void titleOfOrders(){
        wd.findElement(By.id("subtab-AdminParentOrders")).click();
        chechBeforeAndAfter();
    }

    public void titleOfCustomers(){
        wd.findElement(By.id("subtab-AdminParentCustomer")).click();
        chechBeforeAndAfter();
    }

    public void titleOfSupport(){
        wd.findElement(By.id("subtab-AdminParentCustomerThreads")).click();
        chechBeforeAndAfter();
    }


}
