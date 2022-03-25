package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HelloSeleniumMaven {

    public static void automate(List<String> userDetail) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyankverma\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userDetail.toArray(new String[0]));
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(userDetail.toArray(new String[1]));
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        List<WebElement>all_price= driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        List<Double>all_parsed_price=new ArrayList<>();
        for(int i=0;i<all_price.size();i++){
            String element_price= all_price.get(i).getText();
            String price_without_dollar= element_price.substring(1);
            Double element_parsed_price= Double.parseDouble(price_without_dollar);
            all_parsed_price.add(element_parsed_price);

        }
        double max = Double.MAX_VALUE;
        for(double ele : all_parsed_price){
            max=Math.max(max,ele);
        }
        System.out.println(max);
        double hundred= 100.00;
        if(max<hundred){
            System.out.println("Less than $100");
        }
        else System.out.println("More than hundred");

    }
}
