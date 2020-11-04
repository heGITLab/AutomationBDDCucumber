package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StepsExamples {

    WebDriver driver;

    @Given("^Open the chrome and launch the application$")
    public void launchAppByOpenningChrome() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/harindaekanayake/Downloads/MacSoft/Selenium/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("This step will open the chrome and launch the application.");
    }

    @When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void typeUNandPW(String userName, String password) throws Throwable {
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        System.out.println("This step will enter Username and Password.");
    }

    @Then("^Login to the application$")
    public void appLogin() throws Throwable {
        driver.findElement(By.id("btnLogin")).click();
        drWait(By.id("menu_dashboard_index"), 2);
        System.out.println("This step will click on login button.");
    }

    @And("^Click on time, attendance and punchInOut$")
    public void enterTimeDetaile() throws InterruptedException {
        driver.findElement(By.id("menu_time_viewTimeModule")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("menu_attendance_Attendance")))
                .moveToElement(driver.findElement(By.id("menu_attendance_punchIn")))
                .click().build().perform();
        Thread.sleep(2000);
    }

    @And("^Enter punch in details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterPunchIn(String dateIn, String timeIn, String noteIn) throws InterruptedException {
        WebElement dateEl = driver.findElement(By.id("attendance_date"));
        WebElement timeEl = driver.findElement(By.id("attendance_time"));
        WebElement noteEl = driver.findElement(By.id("attendance_note"));

        dateEl.clear();
        dateEl.sendKeys(dateIn);
        timeEl.clear();
        timeEl.sendKeys(timeIn);
        noteEl.clear();
        noteEl.sendKeys(noteIn);
        driver.findElement(By.id("btnPunch")).click();
        Thread.sleep(2000);
    }

    @And("^Enter punch out details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterPunchOut(String dateOut, String timeOut, String noteOut) throws InterruptedException {
        WebElement dateEl = driver.findElement(By.id("attendance_date"));
        WebElement timeEl = driver.findElement(By.id("attendance_time"));
        WebElement noteEl = driver.findElement(By.id("attendance_note"));

        dateEl.clear();
        dateEl.sendKeys(dateOut);
        timeEl.clear();
        timeEl.sendKeys(timeOut);
        noteEl.clear();
        noteEl.sendKeys(noteOut);
        driver.findElement(By.id("btnPunch")).click();
        WebElement el = driver.findElement(By.xpath("//h1[contains(text(),'Punch In')]"));
        Assert.assertEquals(el.getText(), "Punch In");
    }

    @Then("^Close the browser$")
    public void tearDown() {
        driver.quit();
        System.out.println("This step will close the browser.");
    }

    public void drWait(By path, long se) {
        WebDriverWait driverWait = new WebDriverWait(driver, se);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(path));
    }

}
