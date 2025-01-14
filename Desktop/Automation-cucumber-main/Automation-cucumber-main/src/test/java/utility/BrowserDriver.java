package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserDriver {

    protected static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {

            System.setProperty("webdriver.edge.driver", "C:\\Users\\ASSURANCE07\\Desktop\\Setup\\mythings\\mythings\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        return driver;
    }

}