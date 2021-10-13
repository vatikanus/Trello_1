import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {


    @BeforeMethod
    public void preconditions(){
        WebDriver wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
    }

@Test
public void testName(){
}
@AfterMethod
    public void postconditions(){
}

}
