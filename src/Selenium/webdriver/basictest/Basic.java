package Selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E://Software_Testing//BrowserDriver//geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&TL=AM3QAYb8RaStBMwqtsqHVT8ih1vMLtcRrMsf7g7hPrQE965bhl5tUj5SErrEe5dU/");
	
        driver.findElement(By.id("identifierId")).sendKeys("KLE");	
        
        //driver.findElement(By.id(id))
	}

}
