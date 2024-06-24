https://www.pvpsiddhartha.ac.in/dep_it/lecture%20notes/STM/STM_UNIT%202.pdf
//how to wait in code
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

search by web element or xpath
// Locate an element by its Name
        WebElement elementByName = driver.findElement(By.name("example-name")); // Replace with actual Name
        System.out.println("Element found by Name: " + elementByName.getText());

// Locate an element by form name and element name
        WebElement elementByFormName = driver.findElement(By.name("example-form-name"));
        WebElement elementInForm = elementByFormName.findElement(By.name("example-element-name")); // Replace with actual form and element names
        System.out.println("Element found by Form Name and Element Name: " + elementInForm.getText());


// Locate an element using XPath
        WebElement elementByXPath = driver.findElement(By.xpath("//tagname[@attribute='value']")); // Replace with actual XPath
        System.out.println("Element found by XPath: " + elementByXPath.getText());


WebElement elementByFormName = driver.findElement(By.name("example-form-name"));
WebElement elementInForm = elementByFormName.findElement(By.name("example-element-name"));


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocatorExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the desired URL
            driver.get("https://www.example.com"); // Replace with your URL

            // Locate element by ID using XPath
            WebElement elementById = driver.findElement(By.xpath("//*[@id='example-id']"));
            System.out.println("Element found by ID using XPath: " + elementById.getText());

            // Locate element by class name using XPath
            WebElement elementByClassName = driver.findElement(By.xpath("//*[@class='example-class']"));
            System.out.println("Element found by Class Name using XPath: " + elementByClassName.getText());

            // Locate element by tag name using XPath
            WebElement elementByTagName = driver.findElement(By.xpath("//input"));
            System.out.println("Element found by Tag Name using XPath: " + elementByTagName.getText());

            // Locate element by attribute value using XPath
            WebElement elementByAttribute = driver.findElement(By.xpath("//*[@attribute='value']"));
            System.out.println("Element found by Attribute Value using XPath: " + elementByAttribute.getText());

            Thread.sleep(3000); // Wait for 3 seconds to observe the output
        } finally {
            driver.quit(); // Close the browser session
        }
    }
}




WebElement userNameInput = driver.findElement(By.xpath("//input[@name='userName']"));
WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));

            // Perform actions on the input element
 userNameInput.sendKeys("karan.dp");
            passwordInput.sendKeys("karan.dp"); // Enter text into the input field




// Find the submit button element using XPath by type and name attributes
            WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit' and @name='submit']"));

            // Perform actions on the submit button element
            submitButton.click(); // Click on the submit button
            Thread.sleep(2000); // Wait for 2 seconds to observe the action




WebElement userNameInput = driver.find_element(By.ID, "product_description").text

WebElement userNameInput = driver.find_element(By.CSS_SELECTOR, "#product_description").text

WebElement userNameInpu = driver.find_element(By.XPATH, "//*[@id='product_description']").text




package com.mycompany.testsqa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewClass {
        public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch browser and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        WebElement userNameInput = driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
            // Perform actions on the input element
            userNameInput.sendKeys("karan.dp");
            passwordInput.sendKeys("karan.dp"); // Enter text into the input field
        Thread.sleep(2000);

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close browser
        driver.close();

	}
}
