package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

//data tables with maps for parameterization of test cases
public class StepsDDT {
//
//    WebDriver driver;
//
//    @Given("^Open the chrome and launch the application$")
//    public void launchAppByOpenningChrome() throws Throwable {
//        System.setProperty("webdriver.chrome.driver", "/Users/harindaekanayake/Downloads/MacSoft/Selenium/chrome/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//        System.out.println("This step will open the chrome and launch the application.");
//    }
//
//    @When("Enter the Username and Password$")
//    public void typeUNandPW(DataTable credentials) throws Throwable {
//        List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
//        for (Map<String, String> cred : data) {
//            driver.findElement(By.id("txtUsername")).sendKeys(cred.get("username"));
//            Thread.sleep(2000);
//            driver.findElement(By.id("txtPassword")).sendKeys(cred.get("password"));
//            Thread.sleep(2000);
//        }
//        System.out.println("This step will enter Username and Password.");
//    }
//
//    @Then("^Login to the application$")
//    public void appLogin() throws Throwable {
//        driver.findElement(By.id("btnLogin")).click();
//        drWait(By.id("menu_dashboard_index"), 2);
//        System.out.println("This step will click on login button.");
//    }
//
//    @And("^Click on time, attendance and punchInOut$")
//    public void enterTimeDetaile() throws InterruptedException {
//        punchTime();
//    }
//
//    @And("^Enter punch inOut details$")
//    public void enterPunchIn(DataTable credentials) throws InterruptedException {
//
//        WebElement dateEl = driver.findElement(By.id("attendance_date"));
//        WebElement timeEl = driver.findElement(By.id("attendance_time"));
//        WebElement noteEl = driver.findElement(By.id("attendance_note"));
//        WebElement stalElemDateOut = null;
//        WebElement stalElemTimeOut = null;
//        WebElement stalElemNoteOut = null;
//
////        WebElement stalElemDate = null;
////        WebElement stalElemTime = null;
////        WebElement stalElemNote = null;
//
//        int counter = 0;
//        List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
//        for (Map<String, String> cred : data) {
//
//            while (counter < data.size()) {
//                dateEl.clear();
//                dateEl.sendKeys(cred.get("dateIn"));
//                Thread.sleep(2000);
//                timeEl.clear();
//                timeEl.sendKeys(cred.get("timeIn"));
//                Thread.sleep(2000);
//                noteEl.clear();
//                noteEl.sendKeys(cred.get("noteIn"));
//                Thread.sleep(2000);
//                driver.findElement(By.id("btnPunch")).click();
//                Thread.sleep(2000);
//
//                int count = 0;
//                while (count < 4) {
//                    try {
//                        stalElemDateOut = driver.findElement(By.id("attendance_date"));
//                        stalElemTimeOut = driver.findElement(By.id("attendance_time"));
//                        stalElemNoteOut = driver.findElement(By.id("attendance_note"));
//
////                        stalElemDate.clear();
////                        stalElemDate.sendKeys(cred.get("dateIn"));
////                        Thread.sleep(2000);
////                        stalElemTime.clear();
////                        stalElemTime.sendKeys(cred.get("timeIn"));
////                        Thread.sleep(2000);
////                        stalElemNote.clear();
////                        stalElemNote.sendKeys(cred.get("noteIn"));
////                        Thread.sleep(2000);
////                        driver.findElement(By.id("btnPunch")).click();
////                        Thread.sleep(2000);
//
//                        stalElemDateOut.clear();
//                        stalElemDateOut.sendKeys(cred.get("dateOut"));
//                        Thread.sleep(2000);
//                        stalElemTimeOut.clear();
//                        stalElemTimeOut.sendKeys(cred.get("timeOut"));
//                        Thread.sleep(2000);
//                        stalElemNoteOut.clear();
//                        stalElemNoteOut.sendKeys(cred.get("noteOut"));
//                        Thread.sleep(2000);
//
//                    } catch (StaleElementReferenceException e) {
//
//                        e.toString();
//                        System.out.println(e.getMessage());
//                        count = count + 1;
//                    }
//
//                    count = count + 4;
//                }
//                driver.findElement(By.id("btnPunch")).click();
//                Thread.sleep(2000);
//                WebElement el = driver.findElement(By.xpath("//h1[contains(text(),'Punch In')]"));
//                Assert.assertEquals(el.getText(), "Punch In");
//                punchTime();
//                counter++;
//            }
//
////        Thread.sleep(2000);
//        }
//    }
//
////    @And("^Enter punch out details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
////    public void enterPunchOut(String dateOut, String timeOut, String noteOut) throws InterruptedException {
////        WebElement dateEl = driver.findElement(By.id("attendance_date"));
////        WebElement timeEl = driver.findElement(By.id("attendance_time"));
////        WebElement noteEl = driver.findElement(By.id("attendance_note"));
////
////        dateEl.clear();
////        dateEl.sendKeys(dateOut);
////        timeEl.clear();
////        timeEl.sendKeys(timeOut);
////        noteEl.clear();
////        noteEl.sendKeys(noteOut);
////        driver.findElement(By.id("btnPunch")).click();
////        WebElement el = driver.findElement(By.xpath("//h1[contains(text(),'Punch In')]"));
////        Assert.assertEquals(el.getText(), "Punch In");
////    }
//
//    @Then("^Close the browser$")
//    public void tearDown() {
//        driver.quit();
//        System.out.println("This step will close the browser.");
//    }
//
//    public void drWait(By path, long se) {
//        WebDriverWait driverWait = new WebDriverWait(driver, se);
//        driverWait.until(ExpectedConditions.presenceOfElementLocated(path));
//    }
//
//    public void drWaitStale(WebElement element, long se) {
//        WebDriverWait driverWait = new WebDriverWait(driver, se);
//        driverWait.until(ExpectedConditions.stalenessOf(element));
//    }
//
//    public void punchTime() throws InterruptedException {
//        driver.findElement(By.id("menu_time_viewTimeModule")).click();
//        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.id("menu_attendance_Attendance")))
//                .moveToElement(driver.findElement(By.id("menu_attendance_punchIn")))
//                .click().build().perform();
//        Thread.sleep(2000);
//    }
//
}
