import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    // Incorrect XPath to generate an error
    public static String userregistration_xpath = "/html/body/center/h2";  // This will cause an error as the XPath doesn't exist

    public static void visibility_user_registration_page() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals("User Registration Page",actualproductcategory_fs);
    }
}