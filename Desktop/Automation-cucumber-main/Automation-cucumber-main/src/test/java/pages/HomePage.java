package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_LinkText = "Sign In Portal";
    public static String onlineProductsPage_link_LinkText = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException {
        // Specify the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASSURANCE07\\Desktop\\Setup\\mythings\\mythings\\edgedriver_win64\\msedgedriver.exe");


        // Initialize the WebDriver instance
        driver = new  EdgeDriver();

        // Open the website
        driver.get("https://monumental-sunflower-f92309.netlify.app/");
        Thread.sleep(2000);

        // Interact with the hamburger menu
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_LinkText)).click();
    }

    public static void click_OnlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }
}
