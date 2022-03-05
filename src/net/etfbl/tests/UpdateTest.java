package net.etfbl.tests;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UpdateTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void update() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Add Student")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("marko");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("marko@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("nikola");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("nikola@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.linkText("View Student")).click();
    driver.findElement(By.cssSelector(".odd .btn-info")).click();
    driver.findElement(By.cssSelector(".modal-body")).click();
    driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys("luka");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).sendKeys("luka@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched:nth-child(2)")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.cssSelector(".btn-danger")).click();
    assertThat(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[1]")).getText(), is("luka"));
    assertThat(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[2]")).getText(), is("luka@gmail.com"));
    assertThat(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[3]")).getText(), is("MCA"));
    driver.findElement(By.cssSelector("tr:nth-child(2) .btn-info")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
    driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys("stefan");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).sendKeys("stefan@gmail.com");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) > .form-control")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div[1]/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.cssSelector(".btn-danger")).click();
    assertThat(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[2]/td[1]")).getText(), is("stefan"));
    assertThat(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[2]/td[2]")).getText(), is("stefan@gmail.com"));
    assertThat(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr[2]/td[3]")).getText(), is("M-Tech"));
  }
}