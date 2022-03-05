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

public class CreateTest {
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
  public void create() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.linkText("Add Student")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("luka");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("luka@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("marko");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("marko@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("stefan");
    driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("stefan@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
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
      dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.linkText("View Student")).click();
    vars.put("numOfStudents", driver.findElements(By.xpath("//*[@id=\"DataTables_Table_1\"]/tbody/tr")).size());
    assertEquals(vars.get("numOfStudents").toString(), "4");
    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > .sorting_1")).getText(), is("luka"));
    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(2)")).getText(), is("luka@gmail.com"));
    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).getText(), is("B-Tech"));
    assertThat(driver.findElement(By.cssSelector(".even:nth-child(2) > .sorting_1")).getText(), is("marko"));
    assertThat(driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(2)")).getText(), is("marko@gmail.com"));
    assertThat(driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(3)")).getText(), is("BCA"));
    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(3) > .sorting_1")).getText(), is("nikola"));
    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(3) > td:nth-child(2)")).getText(), is("nikola@gmail.com"));
    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(3) > td:nth-child(3)")).getText(), is("M-Tech"));
    assertThat(driver.findElement(By.cssSelector(".even:nth-child(4) > .sorting_1")).getText(), is("stefan"));
    assertThat(driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(2)")).getText(), is("stefan@gmail.com"));
    assertThat(driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(3)")).getText(), is("MCA"));
  }
}
