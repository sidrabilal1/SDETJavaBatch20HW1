package org.example.e198;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;

public class ConfigurationFiles {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/org/example/e198/Configuration.properties";
        String browser = ConfigReader.readConfig(path,"browser");
        String url = ConfigReader.readConfig(path,"url");
        String implicitWait = ConfigReader.readConfig(path,"implicitWait");


        RemoteWebDriver driver = null;
        if(browser.equals("firefox")){
            driver= new FirefoxDriver();
        }else if(browser.equals("chrome")){
            driver = new ChromeDriver();

        }

        driver.get(url);
        try{
            driver.findElements(By.id("s"));
            System.out.println("Elements found");

        } catch (Exception e){
            System.out.println("Element not found");

        }
        driver.quit();
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        System.out.println("Implicit Wait: " + implicitWait + " seconds");
    }
}
