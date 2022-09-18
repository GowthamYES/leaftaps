package testCode1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver(). setup();
		
        EdgeDriver driver = new EdgeDriver();

        driver.get("http://leaftaps.com/opentaps/control/main");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        // identify WebElement
      
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
       
    //to get the attribute value of the username
	String userNameEle = driver.findElement(By.id("username")).getAttribute("value");
	System.out.println(userNameEle);
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
      driver.findElement(By.linkText( "CRM/SFA")).click();
      
     
      driver.findElement(By.linkText("Leads")).click();
      
      driver.findElement(By.linkText("Create Lead")).click();
      
      //WebElement sourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
      //to select the drop down we must creat the object through this we ca choose the droup down
      //select is a class from java
    // Select vv=new Select(sourceEle);
      // vv.selectByVisibleText("Employee");
      
   driver.findElement(By.xpath("//option[text()='Employee']")).click();
      
   String text1 = driver.findElement(By.xpath("//option[text()='Employee']")).getText();
   System.out.println(text1);
   
      //driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GORA TECH");
      
      //driver.findElement(By.id("createLeadForm_firstName")).sendKeys("GOWTHAM");
      
      //driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
  
      //driver.findElement(By.name("submitButton")).click();
   
    Thread.sleep(3000);
    driver.close();
   
}
} 
